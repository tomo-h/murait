package study.addbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import study.addbook.beans.Book;
import study.addbook.beans.BookIF;
import study.addbook.beans.Magazine;
import study.addbook.util.FileUtil;

/**
 * 演習問題解答例
 * @author tomo*h
 *
 */
public class AddBook {

    public static void main(String[] args) {
        // 入力チェック省略

        // 古いファイルの削除
        File old = new File(Constants.FILE_OLD);
        if (old.exists()) {
            old.delete();
        }

        // 既存ファイル読込/ファイル名変更
        List<String> bookList = null;
        File dat = new File(Constants.FILE_DAT);
        try {
            if (dat.exists()) {
                bookList = FileUtil.readFile(Constants.FILE_DAT);
                dat.renameTo(old);
            } else {
                dat.createNewFile();
                bookList = new ArrayList<String>();
            }
        } catch (IOException e) {
            System.err.println("ファイル入出力エラーが発生しました");
            e.printStackTrace();
            System.exit(-1);
        }

        // ここではインターフェースBookIFのオブジェクトを作成しておく
        BookIF book = null;
        if (Constants.CLS_BOOK.equals(args[0])) {
            // 「B」ならBookオブジェクトを代入
            book = new Book();
        } else if (Constants.CLS_MAGAZINE.equals(args[0])) {
            // 「M」ならMagazineオブジェクトを代入
            book = new Magazine();
        } else {
            System.err.println("書籍区分には「B」または「M」のいずれかを入力してください");
            System.exit(-1);
        }

        // JavaBeansにデータをセット。
        // 本でも雑誌でもBookIFのメソッドを呼び出すが、
        // BookとMagazineとでは実装が異なるので、それぞれの処理が実行される
        book.setParam(args);

        bookList.add(book.toString());
        try {
            FileUtil.write(Constants.FILE_DAT, bookList);
        } catch (IOException e) {
            System.err.println("ファイル入出力エラーが発生しました");
            e.printStackTrace();
            System.exit(-1);
        }
        System.out.println("処理を終了しました");
    }

}
