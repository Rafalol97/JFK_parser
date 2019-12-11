import java.util.ArrayList;

public final class  Registry {
    public static Integer  EAX = null;
    public static Integer  EBX = null;
    public static Integer  ECX = null;
    public static Integer  EDX = null;
    public static ArrayList<Integer> stack = null;
    public static Integer parseRegistry(String registry){
        if(registry.equals("%eax"))
            return EAX;
        else if(registry.equals("%ebx"))
            return EBX;
        else if(registry.equals("%ecx"))
            return ECX;
       else if (registry.equals("%edx"))
            return EDX;
       else return Integer.parseInt(registry);
    }
    public static boolean setRegistry(String registry, int value){
        if(registry.equals("%eax"))
            EAX = value;
        else if(registry.equals("%ebx"))
            EBX = value;
        else if(registry.equals("%ecx"))
            ECX = value;
        else if (registry.equals("%edx"))
            EDX = value;
        return true;
    }
}
