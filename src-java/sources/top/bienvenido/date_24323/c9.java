package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ComponentInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.common.ext.MundoAccountSession;
import top.bienvenido.mundo.common.ext.MundoServiceConnection;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/c9.class */
public abstract class c9 extends MundoAccountSession implements IBinder.DeathRecipient, ServiceConnection {

    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public static final u8 f41 = new u8();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final String f42;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final boolean f43;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final boolean f44;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final String f45;

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public final boolean f46xaa30c2c7;

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final boolean f47;

    /* JADX INFO: renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈, reason: contains not printable characters */
    public IAccountManagerResponse f48xb7bf1d91;

    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第, reason: contains not printable characters */
    public IAccountAuthenticator f49;

    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public final MundoServiceConnection f505 = new MundoServiceConnection(this);

    public c9(IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        this.f42 = str;
        this.f43 = z;
        this.f44 = z2;
        this.f45 = str2;
        this.f46xaa30c2c7 = z3;
        this.f47 = z4;
        this.f48xb7bf1d91 = iAccountManagerResponse;
        u8 u8Var = f41;
        int iHashCode = toString().hashCode();
        synchronized (u8Var) {
            u8Var.f358.m386(iHashCode, this);
        }
        if (iAccountManagerResponse != null) {
            try {
                iAccountManagerResponse.asBinder().linkToDeath(this, 0);
            } catch (Exception unused) {
                this.f48xb7bf1d91 = null;
                m113();
            }
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m110(Bundle bundle) {
        Intent intent = (Intent) bundle.getParcelable("intent");
        if (intent != null && intent.getClipData() == null) {
            intent.setClipData(ClipData.newPlainText(null, null));
        }
    }

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final IAccountManagerResponse m111() {
        IAccountManagerResponse iAccountManagerResponse = this.f48xb7bf1d91;
        if (iAccountManagerResponse == null) {
            m113();
            return null;
        }
        m113();
        return iAccountManagerResponse;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f48xb7bf1d91 = null;
        m113();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public final void m1125() {
        String str = this.f42;
        m3.f224.getClass();
        m1 m1Var = (m1) m3.f225.f198.get(str);
        if (m1Var != null) {
            Intent intent = new Intent("android.accounts.AccountAuthenticator");
            ServiceInfo serviceInfo = m1Var.f222;
            intent.setComponent(new ComponentName(((ComponentInfo) serviceInfo).packageName, ((ComponentInfo) serviceInfo).name));
            if (w3.f375.mo79(intent, (IBinder) this.f505, "0") != -1) {
                return;
            }
        }
        onError(1, "bind failure");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f49 = IAccountAuthenticator.Stub.asInterface(iBinder);
        try {
            mo101dj();
        } catch (Exception unused) {
            onError(1, "remote exception");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        IAccountManagerResponse iAccountManagerResponseM111 = m111();
        if (iAccountManagerResponseM111 != null) {
            try {
                iAccountManagerResponseM111.onError(1, "disconnected");
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public abstract void mo101dj();

    @Override // top.bienvenido.mundo.common.ext.MundoAccountSession
    public void onResult(Bundle bundle) {
        boolean z;
        if (bundle != null) {
            boolean z2 = this.f47 && (bundle.getBoolean("booleanResult", false) || (bundle.containsKey("authAccount") && bundle.containsKey("accountType")));
            if (z2 || this.f46xaa30c2c7) {
                m3 m3Var = m3.f224;
                String str = this.f45;
                String str2 = this.f42;
                m3Var.getClass();
                try {
                    Iterator it = m3.f225.f197.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        Account account = ((C0068) it.next()).f516;
                        if (Intrinsics.areEqual(account.type, str2) && Intrinsics.areEqual(account.name, str)) {
                            z = true;
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
                if (z2 && z) {
                    m3 m3Var2 = m3.f224;
                    String str3 = this.f45;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = "com.google";
                    }
                    Account account2 = new Account(str4, this.f42);
                    m3Var2.getClass();
                    try {
                        for (C0068 c0068 : m3.f225.f197) {
                            if (Intrinsics.areEqual(c0068.f516, account2)) {
                                c0068.f520xaa30c2c7 = System.currentTimeMillis();
                                break;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (this.f46xaa30c2c7) {
                    long j = -1;
                    if (z) {
                        m3 m3Var3 = m3.f224;
                        String str5 = this.f45;
                        String str6 = str5;
                        if (str5 == null) {
                            str6 = "com.google";
                        }
                        Account account3 = new Account(str6, this.f42);
                        m3Var3.getClass();
                        try {
                            Iterator it2 = m3.f225.f197.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    j = -1;
                                    break;
                                }
                                C0068 c0069 = (C0068) it2.next();
                                if (Intrinsics.areEqual(c0069.f516, account3)) {
                                    j = c0069.f520xaa30c2c7;
                                    break;
                                }
                                j = -1;
                                break;
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    bundle.putLong("lastAuthenticatedTime", j);
                }
            }
        }
        if (bundle != null) {
            m110(bundle);
        }
        IAccountManagerResponse iAccountManagerResponseM111 = (this.f43 && bundle != null && bundle.containsKey("intent")) ? this.f48xb7bf1d91 : m111();
        if (iAccountManagerResponseM111 != null) {
            try {
                if (bundle == null) {
                    iAccountManagerResponseM111.onError(5, "null bundle returned");
                    return;
                }
                if (this.f44) {
                    bundle.remove("authtoken");
                }
                if (bundle.getInt("errorCode", -1) > 0) {
                    iAccountManagerResponseM111.onError(bundle.getInt("errorCode"), bundle.getString("errorMessage"));
                } else {
                    iAccountManagerResponseM111.onResult(bundle);
                }
            } catch (Exception unused4) {
            }
        }
    }

    @Override // top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onRequestContinued() {
    }

    @Override // top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onError(int i, String str) {
        IAccountManagerResponse iAccountManagerResponseM111 = m111();
        if (iAccountManagerResponseM111 != null) {
            try {
                iAccountManagerResponseM111.onError(i, str);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public final void m113() {
        boolean zM388;
        u8 u8Var = f41;
        int iHashCode = toString().hashCode();
        synchronized (u8Var) {
            zM388 = u8Var.f358.m388(iHashCode);
        }
        if (zM388) {
            IAccountManagerResponse iAccountManagerResponse = this.f48xb7bf1d91;
            if (iAccountManagerResponse != null) {
                iAccountManagerResponse.asBinder().unlinkToDeath(this, 0);
                this.f48xb7bf1d91 = null;
            }
            if (this.f49 != null) {
                this.f49 = null;
                w3.f375.mo80(this.f505);
            }
        }
    }
}
