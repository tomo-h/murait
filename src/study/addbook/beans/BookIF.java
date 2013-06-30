package study.addbook.beans;

public interface BookIF {

    /**
     * コマンドライン引数をJavaBeansに設定する
     * @param args コマンドライン引数
     */
    public void setParam(String[] args);

    /**
     * JavaBeansの持つ書籍情報を文字列にして返却
     * @return
     */
    public String toString();

}
