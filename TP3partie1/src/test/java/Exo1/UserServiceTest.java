package Exo1;

import Exo1.User;
import Exo1.UserRepository;
import Exo1.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UserServiceTest {
    @Test
    void testGetUserById(){
        UserRepository mockUserRpository=mock(UserRepository.class);
        UserService userService=new UserService(mockUserRpository);
        User testUser=new User(123);

        when(mockUserRpository.findUserById(123)).thenReturn(testUser);

        User resultUser=userService.getUserById(123);

        assertEquals(123, resultUser.getId());


        // assertEquals(testUser,resultUser); this is true but why ? shouldnt be wrong because of different adress


        verify(mockUserRpository).findUserById(123);





    }



}