package study.addbook.beans;

import study.addbook.Constants;

public class Magazine extends AbstractBook {
    // 雑誌コード
    private String code;
    // 号数
    private String number;

    private String getCode() {
        return code;
    }

    private void setCode(String code) {
        this.code = code;
    }

    private String getNumber() {
        return number;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void setParam(String[] args) {
        super.setParam(args);
        this.setCode(args[7]);
        this.setNumber(args[8]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" ");
        sb.append(Constants.KEY_CODE).append("：").append(this.getCode()).append(" ");
        sb.append(Constants.KEY_NUMBER).append("：").append(this.getNumber());
        return sb.toString();
    }
}
