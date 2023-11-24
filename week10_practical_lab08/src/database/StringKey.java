package database;

public class StringKey implements Key {
    private String k;

    public StringKey(String key) {
        k = key;
    }

    /** equals 인수로 제공된 키와 자신이 같은지 비교
     * @param m 비교 대상 키
     * @return 같으면 true, 다르면 false */
    public boolean equals(Key m) {
        if(m instanceof StringKey)
        return k.equals(((StringKey)m).getString());
        else
            return false;
    }

    public String getString() {
        return k;
    }
}
