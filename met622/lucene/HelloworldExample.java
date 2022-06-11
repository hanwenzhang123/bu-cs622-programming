package edu.bu.met622.lucene;

import java.io.IOException;
import java.nio.file.Paths;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;


public class HelloworldExample {
	public static void main(String[] args){ 
	try {
        // 0. Specify the analyzer for tokenizing text.  The same analyzer should be used for indexing and searching
        StandardAnalyzer analyzer = new StandardAnalyzer();

		// 1. create the index
        //Directory index = new Directory(Files.createTempDirectory("XXXXX"));
		//Directory index = new ByteBuffersDirectory();
        FSDirectory index = FSDirectory.open(Paths.get("/Users/rawassizadeh/WORK/eclipseworkspace/CSMET622")); 
        
        IndexWriterConfig config = new IndexWriterConfig(analyzer);

        IndexWriter w = new IndexWriter(index, config);
        addDoc(w, "Lucene in Action", "193398817");
        addDoc(w, "Lucene for Dummies", "55320055Z");
        addDoc(w, "Managing Gigabytes - Lucene", "55063554A");
        addDoc(w, "The Art of Computer Science", "9900333X");
        addDoc(w, "Chicken and Data: Machine Leanrning" ,"2343235X");
        w.close();

        // 2. query
        String querystr = new String("Lucene"); // 

        // the "title" arg specifies the default field to use
        // when no field is explicitly specified in the query.
        Query q = new QueryParser("title", analyzer).parse(querystr);

        // 3. search
        int hitsPerPage = 3; // play with this parameter
        IndexReader reader = DirectoryReader.open(index);
        IndexSearcher searcher = new IndexSearcher(reader);
        TopDocs docs = searcher.search(q, hitsPerPage);
        ScoreDoc[] hits = docs.scoreDocs;

        // 4. display results
        System.out.println("Found " + hits.length + " hits.");
        for(int i=0; i<hits.length; ++i) {
            int docId = hits[i].doc;
            Document d = searcher.doc(docId);
            System.out.println((i + 1) + ". isbn: " + d.get("isbn") + "\t title: " + d.get("title"));
        }
        // reader can only be closed when there
        // is no need to access the documents any more.
        reader.close();

	 } catch(IOException ex){
		ex.printStackTrace();
	 } catch (ParseException ex2) {
		ex2.printStackTrace();
	 }
    }

    private static void addDoc(IndexWriter w, String title, String isbn) throws IOException {
        Document doc = new Document();
        doc.add(new TextField("title", title, Field.Store.YES));
        // use a string field for isbn because we don't want it tokenized
        doc.add(new StringField("isbn", isbn, Field.Store.YES));
        w.addDocument(doc);
    }
}
