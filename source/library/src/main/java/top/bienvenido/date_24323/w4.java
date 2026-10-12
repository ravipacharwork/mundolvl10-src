package top.bienvenido.date_24323;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import sun.misc.Unsafe;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$Class;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$Executable;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$InvokeStub;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$MethodHandle;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$NeverCall;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/w4.class */
public final class w4 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final long f380;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final long f381;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final int f382;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final Method f383;

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public final long f384xaa30c2c7;

    /* JADX WARN: Multi-variable type inference failed */
    public w4(Class cls) throws NoSuchMethodException {
        Unsafe unsafe = ca.f51;
        this.f380 = unsafe.objectFieldOffset(MundoReflectionStub$Executable.class.getDeclaredField("artMethod"));
        long jObjectFieldOffset = unsafe.objectFieldOffset(MundoReflectionStub$MethodHandle.class.getDeclaredField("artFieldOrMethod"));
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        Class[] clsArr = i.f159;
        Method declaredMethod = MundoReflectionStub$NeverCall.class.getDeclaredMethod("a", clsArr);
        declaredMethod.setAccessible(true);
        long j = unsafe.getLong(lookup.unreflect(declaredMethod), jObjectFieldOffset);
        MethodHandles.Lookup lookup2 = MethodHandles.lookup();
        Method declaredMethod2 = MundoReflectionStub$NeverCall.class.getDeclaredMethod("b", clsArr);
        declaredMethod2.setAccessible(true);
        this.f381 = unsafe.getLong(lookup2.unreflect(declaredMethod2), jObjectFieldOffset) - j;
        Method declaredMethod3 = MundoReflectionStub$InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod3.setAccessible(true);
        this.f383 = declaredMethod3;
        long jObjectFieldOffset2 = unsafe.objectFieldOffset(MundoReflectionStub$Class.class.getDeclaredField("methods"));
        long j2 = unsafe.getLong(cls, jObjectFieldOffset2);
        this.f382 = unsafe.getInt(j2);
        this.f384xaa30c2c7 = ((j - unsafe.getLong(MundoReflectionStub$NeverCall.class, jObjectFieldOffset2)) - this) + j2;
    }
}
