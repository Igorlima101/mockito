import org.example.SimpleExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SimpleTestCaptor {

    @Mock
    private SimpleExample simpleExample;

    @Test
    void test() {
        SimpleExample person = new SimpleExample("Leandro");
        simpleExample.addName(person.getName());
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        Mockito.verify(simpleExample).addName(captor.capture());
        Assertions.assertEquals(person.getName(), captor.getValue());
    }



}
