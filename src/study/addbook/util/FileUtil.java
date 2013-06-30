package study.addbook.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    // インスタンス化不可
    private FileUtil() {
    }

    /**
     * 既存ファイル読込
     * @param src 既存ファイルパス
     * @throws IOException
     */
    public static List<String> readFile(String src) throws IOException {
        File file = new File(src);
        if (!file.exists()) {
            file.createNewFile();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(src), "UTF-8"));
        List<String> bookList = new ArrayList<String>();
        String str;
        try {
            while ((str = br.readLine()) != null) {
                bookList.add(str);
            }
        } catch (IOException e) {
            // 例外処理はメソッド呼出元で行う
            // 例外発生時はfinalyブロックでストリームをcloseした後に例外をthrow
            throw e;

        } finally {
            if (br != null) {
                br.close();
            }
        }
        return bookList;
    }

    /**
     * 書籍情報をファイルに出力する
     * @param dest 出力先ファイルパス
     * @param bookList 出力する書籍情報のリスト
     * @throws IOException
     */
    public static void write(String dest, List<String> bookList) throws IOException {
        File file = new File(dest);
        if (!file.exists()) {
            file.createNewFile();
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest), "UTF-8"));
        try {
            for (int i = 0; i < bookList.size(); i++) {
                bw.write(bookList.get(i));
                bw.newLine();
            }
        } catch (IOException e) {
            // 例外処理はメソッド呼出元で行う
            // 例外発生時はfinalyブロックでストリームをcloseした後に例外をthrow
            throw e;

        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

}
