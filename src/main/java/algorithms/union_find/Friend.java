package algorithms.union_find;

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

    void connect(Friend friend) {
        this.parentId = friend.id;
    }
}
