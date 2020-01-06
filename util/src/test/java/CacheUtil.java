import org.hibernate.annotations.Source;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CacheUtil.class)
public class CacheUtil {

    @Resource
    private StringRedisTemplate redisTemplate;
    @Test
    public void Test(){
        ValueOperations<String, String> operations=redisTemplate.opsForValue();
        String key="users_1";
        String values="City{" +
                "id=" + "4" +
                ", provinceId=" + "50" +
                ", cityName='" + "厦门" + '\'' +
                ", description='" + "凤阳小岗村" + '\'' +
                '}';
        operations.set(key,values);
    }


}
