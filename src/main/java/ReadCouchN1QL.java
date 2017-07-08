/**
 * Created by minhbui on 3/9/17.
 */


import java.util.Arrays;
import java.util.List;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.query.AsyncN1qlQueryResult;
import com.couchbase.client.java.query.N1qlQuery;


public class ReadCouchN1QL {

    //protected static final Logger LOGGER = Logger.getLogger("devguide");

    protected final Cluster cluster;
    protected final Bucket bucket;

    //=== EDIT THESE TO ADAPT TO YOUR COUCHBASE INSTALLATION ===
    public static final String bucketName = "travel-sample";
    public static final String bucketPassword = "";
    public static final List<String> nodes = Arrays.asList("127.0.0.1");

    protected ReadCouchN1QL() {
        //connect to the cluster by hitting one of the given nodes
        cluster = CouchbaseCluster.create(nodes);
        //get a Bucket reference from the cluster to the configured bucket
        bucket = cluster.openBucket(bucketName, bucketPassword);
    }

    private void disconnect() {
        //release shared resources and close all open buckets
        cluster.disconnect();
    }

    public void execute() {
        //connection has been done in the constructor
        doWork();
        disconnect();
    }

    /**
     * Override this method to showcase specific examples.
     * Make them executable by adding a main method calling new ExampleClass().execute();
     */
    protected void doWork() {
        //this one just showcases connection methods, see constructor and shutdown()
        //LOGGER.info("Connected to the cluster, opened bucket " + bucketName);
//        bucket
//                .query(N1qlQuery.simple(select("*").from(i("travel-sample")).limit(10)))
//                .flatMap(AsyncN1qlQueryResult::rows)
//                .toBlocking()
//                .forEach(row -> System.out.println(row.value()));
    }

}
