import org.example.Address;
import org.example.MailServiceApi;
import org.example.Person;
import org.example.PersonRegister;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PersonRegisterTest {

    @Mock
    private MailServiceApi mailServiceApi;

    @InjectMocks
    private PersonRegister personRegister;

    @Test
    void validatePersonRegister(){
        Address address = new Address("Nova", "Velho","SP", "1002");
        Mockito.when(mailServiceApi.findPersonZipcode("1002")).thenReturn(address);
        Person person = personRegister.registerPersonAddress("Igor", "101010", LocalDate.now(), "1002");

        assertEquals("Igor", person.getName());
        assertEquals("101010", person.getDocument());
        assertEquals("SP", address.getState());
    }
}
