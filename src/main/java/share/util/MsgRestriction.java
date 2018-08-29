package share.util;

public final class MsgRestriction {
    private MsgRestriction() {
        throw new IllegalStateException("Utility class");
      }
    public static final String CES001 = "CES.001.001";
    public static final String CES002 = "CES.002.001";
    public static final String CES003 = "CES.003.001";
    public static final String CES010 = "CES.010.001";
    public static final String CES011 = "CES.011.001";
    public static final String CES012 = "CES.012.001";
    public static final String CAS001 = "CAS.001.001";

    public static final int BRANCH_ID_COUNT = 9;
    public static final String XSD_PATH = "src/main/java/share/xsd/";
    public static final String CES001_XSD_PATH = XSD_PATH + "CES.001.001.xsd";
    public static final String CES002_XSD_PATH = XSD_PATH + "CES.002.001.xsd";
    public static final String CES003_XSD_PATH = XSD_PATH + "CES.003.001.xsd";
    public static final String CES010_XSD_PATH = XSD_PATH + "CES.010.001.xsd";
    public static final String CES011_XSD_PATH = XSD_PATH + "CES.011.001.xsd";
    public static final String CES012_XSD_PATH = XSD_PATH + "CES.012.001.xsd";
    public static final String CAS001_XSD_PATH = XSD_PATH + "CAS.001.001.xsd";

}
