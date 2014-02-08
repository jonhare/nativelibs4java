package gtk;
import org.bridj.BridJ;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/glib/ghash.h:45</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Gtk") 
public abstract class GHashTableIter extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : gpointer (Unsupported type) */
	/** Conversion Error : gpointer (Unsupported type) */
	/** Conversion Error : gpointer (Unsupported type) */
	@Field(3) 
	public int dummy4() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public GHashTableIter dummy4(int dummy4) {
		this.io.setIntField(this, 3, dummy4);
		return this;
	}
	/**
	 * Failed to convert value dummy5 of type gboolean<br>
	 * C type : gboolean
	 */
	/** Conversion Error : gpointer (Unsupported type) */
}
