package org.ffmpeg.avdevice;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : libavdevice/avdevice.h:268</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avdevice") 
public class AVDeviceInfoList extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * < list of autodetected devices<br>
	 * C type : AVDeviceInfo**
	 */
	@Field(0) 
	public Pointer<Pointer<AVDeviceInfo > > devices() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * < list of autodetected devices<br>
	 * C type : AVDeviceInfo**
	 */
	@Field(0) 
	public AVDeviceInfoList devices(Pointer<Pointer<AVDeviceInfo > > devices) {
		this.io.setPointerField(this, 0, devices);
		return this;
	}
	/** < number of autodetected devices */
	@Field(1) 
	public int nb_devices() {
		return this.io.getIntField(this, 1);
	}
	/** < number of autodetected devices */
	@Field(1) 
	public AVDeviceInfoList nb_devices(int nb_devices) {
		this.io.setIntField(this, 1, nb_devices);
		return this;
	}
	/** < index of default device or -1 if no default */
	@Field(2) 
	public int default_device() {
		return this.io.getIntField(this, 2);
	}
	/** < index of default device or -1 if no default */
	@Field(2) 
	public AVDeviceInfoList default_device(int default_device) {
		this.io.setIntField(this, 2, default_device);
		return this;
	}
	public AVDeviceInfoList() {
		super();
	}
	public AVDeviceInfoList(Pointer pointer) {
		super(pointer);
	}
}
