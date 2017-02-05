package PKUYouth.Services;

import PKUYouth.DTOs.User;
import PKUYouth.Dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by WangJian on 2017/1/30.
 */
@Service
public class SearchArticleService {
    @Resource
    UserMapper userMapper;
    public User getUser(int title){
        return userMapper.getUser(title);
    }

    public static void main(String args[]){
        SearchArticleService searchArticleService = new SearchArticleService();
        User user = searchArticleService.getUser(1);
        System.out.println(user.getName());
    }
}
