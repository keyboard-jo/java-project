package Objects;

import java.util.ArrayList;

public class DataFileQueryOperator<T> {
    private ArrayList<T> lastQuery;

    public DataFileQueryOperator(ArrayList<T> lastQuery) {
        this.lastQuery = lastQuery;
    }

    public void setLastQuery(ArrayList<T> lastQuery) {
        this.lastQuery = lastQuery;
    }

    public ArrayList<T> getLastQuery() {
        return lastQuery;
    }

    public T first() {
        return (T) this.lastQuery.get(0);
    }

    public ArrayList<T> all() {
        return getLastQuery();
    }
}
