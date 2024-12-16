package ExceptionDemo.ThrowExceptions.CustomerException;

public class NameFormatException extends RuntimeException{
    //技巧:NameFormat表示异常的名字
    //Exception表示这是一个异常类


    //运行时异常:RuntimeException 核心 由于参数错误导致的问题
    //编译时异常:Exception 核心 提醒程序员检查本地信息
    public NameFormatException() {
        super();
    }

    public NameFormatException(String message) {
        super(message);
    }
}
