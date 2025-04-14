import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    void myFirstMockitoTest() {
        // Arrange
        MyDependency mockDependency = Mockito.mock(MyDependency.class);
        Mockito.when(mockDependency.doSomething()).thenReturn("mocked value");

        MyService service = new MyService(mockDependency);

        // Act
        String result = service.performAction();

        // Assert
        assertEquals("mocked value", result);
        Mockito.verify(mockDependency).doSomething();
    }
