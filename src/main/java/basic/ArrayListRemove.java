package basic;

/*
  ArrayList循环遍历并删除元素的常见陷阱
  http://swiftlet.net/archives/743
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        remove2Write(list);

        System.out.print(list);
    }

    //错误写法1：
    //第二个b没遍历到
    public static void remove1(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            if (s.equals("b"))
            {
                list.remove(s);
            }
        }
    }

    //正确写法1
    //倒序删除
    public static void remove1Write(ArrayList<String> list)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            String s = list.get(i);
            if (s.equals("b"))
            {
                list.remove(s);
            }
        }
    }

    //错误写法2：
    //出现异常
    public static void remove2(ArrayList<String> list)
    {
        for (String s : list)
        {
            if (s.equals("b"))
            {
                list.remove(s);
            }
        }
    }

    //正确写法
    public static void remove2Write(ArrayList<String> list)
    {
        Iterator<String> it = list.iterator();
        while (it.hasNext())
        {
            String s = it.next();
            if (s.equals("b"))
            {
                it.remove();
            }
        }
    }


}