package UE5;

import java.util.ArrayList;
import java.util.List;

public interface Mapper <S, T>{

    public T map(S s);
    default public List<T> mapAll(List<S> list){
        List<T> l = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            l.add(map(list.get(i)));
        }
        return l;
    }

}
