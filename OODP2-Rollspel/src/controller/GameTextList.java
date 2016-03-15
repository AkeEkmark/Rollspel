package controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class GameTextList<TYPE> extends Observable {
	protected List<TYPE> list = new ArrayList<TYPE>();

	  public void add(TYPE o)
	    {
	    list.add(o);
	    setChanged();
	    notifyObservers();
	    }

	  public void remove(TYPE o)
	    {
	    if (list.contains(o))
	      {
	      list.remove(o);
	      setChanged();
	      notifyObservers();
	      }
	    }

	  public boolean contains(TYPE o)
	    {
	    return list.contains(o);
	    }

	  public void clear()
	    {
	    list.clear();
	    setChanged();
	    notifyObservers();
	    }

	  public int size()
	    {
	    return list.size();
	    }

	  public TYPE get(int index)
	    {
	    return list.get(index);
	    }


}
