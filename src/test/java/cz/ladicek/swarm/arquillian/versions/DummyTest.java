package cz.ladicek.swarm.arquillian.versions;

import org.jboss.arquillian.config.descriptor.api.ArquillianDescriptor;
import org.jboss.arquillian.config.descriptor.impl.ArquillianDescriptorImpl;
import org.jboss.arquillian.container.impl.ContainerImpl;
import org.jboss.arquillian.container.spi.Container;
import org.jboss.arquillian.container.test.api.Deployer;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.impl.client.deployment.ClientDeployer;
import org.jboss.arquillian.container.test.spi.client.deployment.DeploymentPackager;
import org.jboss.arquillian.core.api.InstanceProducer;
import org.jboss.arquillian.core.impl.loadable.JavaSPIExtensionLoader;
import org.jboss.arquillian.core.spi.LoadableExtension;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.container.JUnitTestRunner;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.arquillian.test.impl.TestExtension;
import org.jboss.arquillian.test.spi.TestEnricher;
import org.jboss.arquillian.testenricher.cdi.CDIInjectionEnricher;
import org.jboss.arquillian.testenricher.ejb.EJBInjectionEnricher;
import org.jboss.arquillian.testenricher.initialcontext.InitialContextProducer;
import org.jboss.arquillian.testenricher.resource.ResourceInjectionEnricher;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.spi.api.JARArchive;

import java.io.IOException;
import java.util.Arrays;

@RunWith(Arquillian.class)
public class DummyTest {
    @Deployment
    public static Archive<?> deployment() throws Exception {
        for (Class<?> clazz : Arrays.asList(
                InstanceProducer.class,
                LoadableExtension.class,
                JavaSPIExtensionLoader.class,
                Container.class,
                ContainerImpl.class,
                ArquillianDescriptor.class,
                ArquillianDescriptorImpl.class,
                Deployer.class,
                DeploymentPackager.class,
                ClientDeployer.class,
                ArquillianResource.class,
                TestEnricher.class,
                TestExtension.class,
                Arquillian.class,
                JUnitTestRunner.class,
                CDIInjectionEnricher.class,
                EJBInjectionEnricher.class,
                InitialContextProducer.class,
                ResourceInjectionEnricher.class)) {
            System.out.println("!!! " + clazz.getPackage().getImplementationTitle() + " = " + clazz.getPackage().getImplementationVersion());
        }

        return ShrinkWrap.create(JARArchive.class);
    }

    @Test
    public void test() throws IOException {
    }
}
