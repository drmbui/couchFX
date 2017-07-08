/**
 * Created by minhbui on 3/9/17.
 */

import com.couchbase.client.deps.com.fasterxml.jackson.core.JsonParser;
import com.couchbase.client.java.*;
import com.couchbase.client.java.document.*;
import com.couchbase.client.java.document.json.*;
import com.couchbase.client.java.query.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.net.*;
import java.io.*;



import java.io.FileReader;
import java.util.Iterator;
import java.util.UUID;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.List;

public class ReadCouch {
    public void Read ()
    {

        // Initialize the Connection
        //Cluster cluster = CouchbaseCluster.create("vcld16rdcrfdb01.ual.com");
        Cluster cluster = CouchbaseCluster.create("localhost");
        Bucket bucket = cluster.openBucket("travel-sample");


        JsonDocument indexDoc = bucket.get("airline_10");
        //System.out.println(indexDoc);
        System.out.println(indexDoc.content().get("name"));



	    /*
	    String[] indexArray = index.trim().split(";");

        int i;

        for (i=0; i<indexArray.length;i++)
        {

        	System.out.println(indexArray[i]);
        }
        */

        //JsonObject content = JsonObject.empty(indexDoc);
        //content.get
        //JsonObject content = JsonObject.empty()


        //close the bucket
        cluster.disconnect();
    }
}
