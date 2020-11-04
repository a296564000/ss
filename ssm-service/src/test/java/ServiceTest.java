import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService)applicationContext.getBean("itemsServiceImpl");
        Items items = new Items();
        items.setName("测试测试");
        itemsService.save(items);
        System.out.println("111");
        System.out.println("2222");
    }
}