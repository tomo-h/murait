package study.addbook;

/**
 * 定数クラス
 * @author tomo
 *
 */
public class Constants {
    // ファイル
    public static final String FILE_DAT      = "./books.dat";
    public static final String FILE_OLD      = "./books.old";

    // 書籍区分
    public static final String CLS_BOOK      = "B";
    public static final String CLS_MAGAZINE  = "M";

    // 書籍情報キー
    // 共通
    public static final String KEY_CLASS     = "区分";
    public static final String KEY_NAME      = "書名";
    public static final String KEY_PUBLISHER = "出版社";
    public static final String KEY_PRICE     = "定価";
    public static final String KEY_DATE      = "出版"; //出版年月日

    // Book
    public static final String KEY_AUTHOR    = "著者";
    public static final String KEY_ISBN      = "ISBN";

    // Magazine
    public static final String KEY_CODE      = "雑誌コード";
    public static final String KEY_NUMBER    = "号数";

}
