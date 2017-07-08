import junit.framework.TestCase;

/**
 * Created by minhbui on 3/9/17.
 */

import org.junit.Rule;
import org.junit.Test;

public class ReadCouchN1QLTest extends TestCase {

    @Test
    public void execute()
    {
        ReadCouchN1QL bucket1 = new ReadCouchN1QL();
        bucket1.execute();
    }


}