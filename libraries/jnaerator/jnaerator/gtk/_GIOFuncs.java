package gtk;
import _GIOFuncs.GError;
import _GIOFuncs.GIOChannel;
import _GIOFuncs.GIOCondition;
import _GIOFuncs.GIOFlags;
import _GIOFuncs.GIOStatus;
import _GIOFuncs.GSeekType;
import _GIOFuncs.gint64;
import _GMemVTable.gsize;
import gtk.GtkLibrary.GSource;
import gtk.GtkLibrary.gchar;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : glib-2.0/glib/giochannel.h:131</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Gtk") 
public class _GIOFuncs extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : io_read_callback* */
	@Field(0) 
	public Pointer<_GIOFuncs.io_read_callback > io_read() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : io_read_callback* */
	@Field(0) 
	public _GIOFuncs io_read(Pointer<_GIOFuncs.io_read_callback > io_read) {
		this.io.setPointerField(this, 0, io_read);
		return this;
	}
	/** C type : io_write_callback* */
	@Field(1) 
	public Pointer<_GIOFuncs.io_write_callback > io_write() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : io_write_callback* */
	@Field(1) 
	public _GIOFuncs io_write(Pointer<_GIOFuncs.io_write_callback > io_write) {
		this.io.setPointerField(this, 1, io_write);
		return this;
	}
	/** C type : io_seek_callback* */
	@Field(2) 
	public Pointer<_GIOFuncs.io_seek_callback > io_seek() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : io_seek_callback* */
	@Field(2) 
	public _GIOFuncs io_seek(Pointer<_GIOFuncs.io_seek_callback > io_seek) {
		this.io.setPointerField(this, 2, io_seek);
		return this;
	}
	/** C type : io_close_callback* */
	@Field(3) 
	public Pointer<_GIOFuncs.io_close_callback > io_close() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : io_close_callback* */
	@Field(3) 
	public _GIOFuncs io_close(Pointer<_GIOFuncs.io_close_callback > io_close) {
		this.io.setPointerField(this, 3, io_close);
		return this;
	}
	/** C type : io_create_watch_callback* */
	@Field(4) 
	public Pointer<_GIOFuncs.io_create_watch_callback > io_create_watch() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : io_create_watch_callback* */
	@Field(4) 
	public _GIOFuncs io_create_watch(Pointer<_GIOFuncs.io_create_watch_callback > io_create_watch) {
		this.io.setPointerField(this, 4, io_create_watch);
		return this;
	}
	/** C type : io_free_callback* */
	@Field(5) 
	public Pointer<_GIOFuncs.io_free_callback > io_free() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : io_free_callback* */
	@Field(5) 
	public _GIOFuncs io_free(Pointer<_GIOFuncs.io_free_callback > io_free) {
		this.io.setPointerField(this, 5, io_free);
		return this;
	}
	/** C type : io_set_flags_callback* */
	@Field(6) 
	public Pointer<_GIOFuncs.io_set_flags_callback > io_set_flags() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : io_set_flags_callback* */
	@Field(6) 
	public _GIOFuncs io_set_flags(Pointer<_GIOFuncs.io_set_flags_callback > io_set_flags) {
		this.io.setPointerField(this, 6, io_set_flags);
		return this;
	}
	/** C type : io_get_flags_callback* */
	@Field(7) 
	public Pointer<_GIOFuncs.io_get_flags_callback > io_get_flags() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : io_get_flags_callback* */
	@Field(7) 
	public _GIOFuncs io_get_flags(Pointer<_GIOFuncs.io_get_flags_callback > io_get_flags) {
		this.io.setPointerField(this, 7, io_get_flags);
		return this;
	}
	/** <i>native declaration : glib-2.0/glib/giochannel.h</i> */
	public static abstract class io_read_callback extends Callback<io_read_callback > {
		public final GIOStatus apply(Pointer<GIOChannel > channel, Pointer<gchar > buf, gsize count, Pointer<gsize > bytes_read, Pointer<Pointer<GError > > err) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(channel), Pointer.getPeer(buf), Pointer.getPeer(count), Pointer.getPeer(bytes_read), Pointer.getPeer(err)), .class);
		}
		@Ptr 
		public abstract long apply(@Ptr long channel, @Ptr long buf, @Ptr long count, @Ptr long bytes_read, @Ptr long err);
	};
	/** <i>native declaration : glib-2.0/glib/giochannel.h</i> */
	public static abstract class io_write_callback extends Callback<io_write_callback > {
		public final GIOStatus apply(Pointer<GIOChannel > channel, Pointer<gchar > buf, gsize count, Pointer<gsize > bytes_written, Pointer<Pointer<GError > > err) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(channel), Pointer.getPeer(buf), Pointer.getPeer(count), Pointer.getPeer(bytes_written), Pointer.getPeer(err)), .class);
		}
		@Ptr 
		public abstract long apply(@Ptr long channel, @Ptr long buf, @Ptr long count, @Ptr long bytes_written, @Ptr long err);
	};
	/** <i>native declaration : glib-2.0/glib/giochannel.h</i> */
	public static abstract class io_seek_callback extends Callback<io_seek_callback > {
		public final GIOStatus apply(Pointer<GIOChannel > channel, gint64 offset, GSeekType type, Pointer<Pointer<GError > > err) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(channel), Pointer.getPeer(offset), Pointer.getPeer(type), Pointer.getPeer(err)), .class);
		}
		@Ptr 
		public abstract long apply(@Ptr long channel, @Ptr long offset, @Ptr long type, @Ptr long err);
	};
	/** <i>native declaration : glib-2.0/glib/giochannel.h</i> */
	public static abstract class io_close_callback extends Callback<io_close_callback > {
		public final GIOStatus apply(Pointer<GIOChannel > channel, Pointer<Pointer<GError > > err) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(channel), Pointer.getPeer(err)), .class);
		}
		@Ptr 
		public abstract long apply(@Ptr long channel, @Ptr long err);
	};
	/** <i>native declaration : glib-2.0/glib/giochannel.h</i> */
	public static abstract class io_create_watch_callback extends Callback<io_create_watch_callback > {
		public final Pointer<GSource > apply(Pointer<GIOChannel > channel, GIOCondition condition) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(channel), Pointer.getPeer(condition)), GSource.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long channel, @Ptr long condition);
	};
	/** <i>native declaration : glib-2.0/glib/giochannel.h</i> */
	public static abstract class io_free_callback extends Callback<io_free_callback > {
		public final void apply(Pointer<GIOChannel > channel) {
			apply(Pointer.getPeer(channel));
		}
		public abstract void apply(@Ptr long channel);
	};
	/** <i>native declaration : glib-2.0/glib/giochannel.h</i> */
	public static abstract class io_set_flags_callback extends Callback<io_set_flags_callback > {
		public final GIOStatus apply(Pointer<GIOChannel > channel, GIOFlags flags, Pointer<Pointer<GError > > err) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(channel), Pointer.getPeer(flags), Pointer.getPeer(err)), .class);
		}
		@Ptr 
		public abstract long apply(@Ptr long channel, @Ptr long flags, @Ptr long err);
	};
	/** <i>native declaration : glib-2.0/glib/giochannel.h</i> */
	public static abstract class io_get_flags_callback extends Callback<io_get_flags_callback > {
		public final GIOFlags apply(Pointer<GIOChannel > channel) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(channel)), .class);
		}
		@Ptr 
		public abstract long apply(@Ptr long channel);
	};
	public _GIOFuncs() {
		super();
	}
	public _GIOFuncs(Pointer pointer) {
		super(pointer);
	}
}
