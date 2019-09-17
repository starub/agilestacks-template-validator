package agilestacks.template.validation.components.docker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MockitoDockerfileTest {

    @Test
    void partialComponentMocking() {

        Dockerfile dockerfile = mock(Dockerfile.class);
        Dockerfile dockerfileSpy = spy(dockerfile);

        when(dockerfile.getFrom()).thenReturn("mockedFrom");

        doCallRealMethod().when(dockerfileSpy).setFrom(Mockito.anyString());

        //noinspection ResultOfMethodCallIgnored
        doCallRealMethod().when(dockerfileSpy).getFrom();

        dockerfileSpy.setFrom("realFrom");

        assertEquals("mockedFrom", dockerfile.getFrom());
        assertEquals("realFrom", dockerfileSpy.getFrom());

    }
}
