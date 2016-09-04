package algorithms.union_find.network_connectivity;

class Friend {
    private static int ID_GENERATOR;
    private int id;
    private int parentId;

    Friend() {
        ID_GENERATOR++;
        this.id = ID_GENERATOR;
        this.parentId = ID_GENERATOR;
    }

    int getId() {
        return id;
    }

    void setParentId(int id) {
        parentId = id;
    }

    int getParentId() {
        return parentId;
    }
}
