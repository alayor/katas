package katas.algorithms.union_find.network_connectivity;

class Friend {
    private int id;
    private int parentId;

    Friend(int id) {
        this.id = id;
        this.parentId = id;
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

    boolean isNotRoot() {
        return id != parentId;
    }
}
