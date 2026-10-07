package catsgram.model;

public enum SORT {
    ASC,
    DESC;

    public static SORT from(String value) {
        switch (value.trim().toLowerCase()) {
            case "ascending":
            case "asc":
                return ASC;
            case "descending":
            case "desc":
                return DESC;
            default:
                return ASC;
        }
    }
}
