import cn.edu.ruc.start.TSBM;

public class TSDBTest {

    public static void main(String[] args) throws Exception {
//        String dataPath = "/Users/fasape/project/tsdb-test/";
//        String className = "cn.edu.ruc.InfluxdbAdapter";
//        String ip = "10.77.110.226";
//        String port = "8086";
//        String userName = "root";
//        String passwd = "root";
//        TSBM.generateData(dataPath);
//        TSBM.startPerformTest(dataPath, className, ip, port, userName, passwd, false, false);
//        testTimescaledb();
        testInfluxdb();
    }
    public static void testIotdb(){
        String dataPath = "/Users/fasape/project/tsdb-test/";
        String className = "cn.edu.ruc.IotdbAdapter";
        String ip = "10.77.110.226";
        String port = "6667";
        String userName = "root";
        String passwd = "root";
        TSBM.startPerformTest(dataPath, className, ip, port, userName, passwd, false, false);
    }
    public static void testInfluxdb(){
        String dataPath = "/Users/fasape/project/tsdb-test/";
        String className = "cn.edu.ruc.InfluxdbAdapter";
        String ip = "10.77.110.226";
        String port = "8086";
        String userName = "root";
        String passwd = "root";
        TSBM.startPerformTest(dataPath, className, ip, port, userName, passwd, false, false);
    }
    public static void testTimescaledb(){
        String dataPath = "/Users/fasape/project/tsdb-test/";
        String className = "cn.edu.ruc.TimescaledbAdapter";
        String ip = "10.77.110.226";
        String port = "5432";
        String userName = "postgres";
        String passwd = "postgres";
        TSBM.startPerformTest(dataPath, className, ip, port, userName, passwd, false, false);
    }
}
