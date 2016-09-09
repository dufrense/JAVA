import com.excel.CompareXlsxData;
import org.junit.Test;

/**
 * Created by duxing on 2016/9/8.
 */
public class TestExcel {

    @Test
    public void testFile() throws Throwable {
        String dir = "C:\\Users\\duxing\\Downloads\\";
        String suffix = ".xlsx";
        String fileNamePrototype = dir + "结算清单excel_prototype" + suffix;

        String fileToBeCompare = dir + "结算清单excel (11)" + suffix;
        new CompareXlsxData().fromExcel(fileNamePrototype,fileToBeCompare);
    }
}
