import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialUsingExecutor {

   static class FactorialTask implements Callable<Long> {
        private final int num;
    
        public FactorialTask(int num)
        {
            this.num=num;
        }
    
        @Override
        public Long call() throws Exception {
            return factorial(num);
    
        }
    
        private Long factorial(int num2) {
           long fact=1;
            for(int i=2;i<=num2;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
    
    }

    public static void main(String[] args) {
        int number=5;
        ExecutorService executor=Executors.newSingleThreadExecutor();
       Future<Long> future = executor.submit(new FactorialTask(number));
       try{
            Long res=future.get();
            System.out.println("factorial"+res);
       }
       catch(ExecutionException | InterruptedException e)
       {
        e.printStackTrace();
       }
       finally
       {
        executor.shutdown();
       }

    } 
    
}


 

