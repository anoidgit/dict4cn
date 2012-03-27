package cn.kk.kkdict.beans;

import java.util.Iterator;
import java.util.TreeSet;

import cn.kk.kkdict.utils.Helper;

public class FormattedTreeSet<E> extends TreeSet<E> {
    private static final long serialVersionUID = -8035295407619357235L;
    private String sep = Helper.SEP_LIST;

    public FormattedTreeSet() {
        super();
    }
    
    public FormattedTreeSet(String sep) {
        super();
        this.sep = sep;
    }

    @Override
    public String toString() {
        Iterator<E> i = iterator();
        if (!i.hasNext())
            return Helper.EMPTY_STRING;

        StringBuilder sb = new StringBuilder();
        for (;;) {
            E e = i.next();
            sb.append(e == this ? Helper.EMPTY_STRING : e);
            if (!i.hasNext())
                return sb.toString();
            sb.append(sep);
        }
    }

    public String getSep() {
        return sep;
    }

    public void setSep(String sep) {
        this.sep = sep;
    }

}
