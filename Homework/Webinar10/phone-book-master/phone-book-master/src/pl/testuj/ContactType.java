package pl.testuj;

public enum ContactType {
    PRIV("Prywatny"),
    MOBI("Komórkowy"),
    WORK("Służbowy");

    private String fullType;

    ContactType(String fullType) {
        this.fullType = fullType;
    }

    public String getFullType() {
        return fullType;
    }
}
