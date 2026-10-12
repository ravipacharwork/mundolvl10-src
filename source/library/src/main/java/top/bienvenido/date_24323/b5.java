package top.bienvenido.date_24323;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/b5.class */
public final class b5 implements Callable {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final u2 f21 = t2.m483(MessageQueue.class, "mMessages");

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final Object f22;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final p2 f23;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final r3 f24;

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public final s3 f25xaa30c2c7;

    public b5() {
        u2 u2Var;
        u2 u2VarM483 = t2.m483(Handler.class, "mQueue");
        h6.f130.getClass();
        this.f22 = u2VarM483.mo393(h6.f132);
        this.f23 = new p2("token");
        this.f24 = new r3(new p2("intents"));
        p2 p2Var = f9.f104xaa30c2c7;
        p2 p2Var2 = new p2("activityInfo");
        if (AbstractC0065x6082d607.f498) {
            u2Var = p2Var;
            p2 p2Var3 = new p2("referrer");
        } else {
            u2Var = u2.f337;
        }
        this.f25xaa30c2c7 = new s3(p2Var, p2Var2, u2Var);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                return null;
            }
            Message message = (Message) this.f21.mo393(this.f22);
            if (message == null) {
                return null;
            }
            h6.f130.getClass();
            if (!Intrinsics.areEqual(h6.f132, message.getTarget())) {
                return null;
            }
            int i = message.what;
            if (i == 100) {
                Object obj = message.obj;
                if (obj == null) {
                    return null;
                }
                s3 s3Var = this.f25xaa30c2c7;
                Object objMo393 = this.f23.f270.mo393(obj);
                s3Var.getClass();
                s3Var.m476(obj, (IBinder) objMo393);
                Unit unit = Unit.INSTANCE;
            } else if (i == 112) {
                Object obj2 = message.obj;
                if (obj2 != null) {
                    this.f24.invoke(obj2);
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
