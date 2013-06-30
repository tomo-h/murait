package study.addbook.util;

public class BookUtil {
    
    // インスタンス化不可
    private BookUtil(){}
    
    /**
     * 「年」「月」「日」の文字列から「年月日」(YYYY/MM/DD)を生成
     * @param year
     * @param month
     * @param day
     * @return String
     */
    public static String getYMD(String year, String month, String day){
        StringBuilder sb = new StringBuilder();
        sb.append(year);
        sb.append("/");
        if(month.length()<2){
            sb.append("0");
        }
        sb.append(month);
        sb.append("/");
        if(day.length()<2){
            sb.append("0");
        }
        sb.append(day);
        return sb.toString();
    }

}
