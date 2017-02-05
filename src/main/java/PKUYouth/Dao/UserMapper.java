package PKUYouth.Dao;

import PKUYouth.DTOs.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by WangJian on 2017/1/30.
 */
@Repository
@Transactional
public interface UserMapper {
    User getUser(int title);
}
