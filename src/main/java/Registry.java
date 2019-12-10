public final class  Registry {
    public static int EAX = 20;
    public static int EBX;
    public static int ECX;
    public static int EDX;
    public static int parseRegistry(String registry){
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
}
