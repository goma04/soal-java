/*
 * generated by Xtext 2.31.0
 */
package soal.dsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import soal.dsl.SoalDslRuntimeModule
import soal.dsl.SoalDslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SoalDslIdeSetup extends SoalDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SoalDslRuntimeModule, new SoalDslIdeModule))
	}
	
}
