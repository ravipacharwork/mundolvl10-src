package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountManagerResponse;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/m3.class */
public final class m3 extends z {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final m3 f224 = new m3();

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final k3 f225 = new k3();

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final String mo24(Account account) {
        if (account == null) {
            return null;
        }
        try {
            for (C0068 c0068 : f225.f197) {
                if (Intrinsics.areEqual(c0068.f516, account)) {
                    return c0068.f517;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final AuthenticatorDescription[] mo26xaa30c2c7() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = f225.f197.iterator();
            while (it.hasNext()) {
                m1 m1Var = (m1) f225.f198.get(((C0068) it.next()).f516.type);
                if (m1Var != null) {
                    arrayList.add(m1Var);
                }
            }
            return (AuthenticatorDescription[]) arrayList.toArray(new AuthenticatorDescription[0]);
        } catch (Exception unused) {
            return new AuthenticatorDescription[0];
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 肏你妈小屄崽子你真没见过黑社会哈肏你妈的敢不敢跟我比划比划肏你妈肏你妈敢不敢比划什么叫做黑手肏你妈的你 */
    public final Account[] mo28(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            for (C0068 c0068 : f225.f197) {
                if (str == null || Intrinsics.areEqual(c0068.f516.type, str)) {
                    arrayList.add(c0068.f516);
                }
            }
            return (Account[]) arrayList.toArray(new Account[0]);
        } catch (Exception unused) {
            return new Account[0];
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo29(IBinder iBinder, Account account, String[] strArr) {
        if (iBinder == null || account == null || strArr == null) {
            return;
        }
        try {
            new w9(IAccountManagerResponse.Stub.asInterface(iBinder), account, strArr).m1125();
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo31(IBinder iBinder, String str, String[] strArr) {
        if (iBinder == null || str == null) {
            return;
        }
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    new m(new h3(iBinder), str, strArr).m1125();
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        m306(iBinder, mo28(str));
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第 */
    public final Account[] mo27() {
        try {
            ArrayList arrayList = f225.f197;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C0068) it.next()).f516);
            }
            return (Account[]) arrayList2.toArray(new Account[0]);
        } catch (Exception unused) {
            return new Account[0];
        }
    }

    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public static final void m301() {
        try {
            C0031x7011f1e3 c0031x7011f1e3 = new C0031x7011f1e3(0);
            try {
                Iterator it = AbstractC0017.m612().iterator();
                while (it.hasNext()) {
                    m1 m1VarM611 = AbstractC0017.m611((ResolveInfo) it.next());
                    String str = m1VarM611 != null ? ((AuthenticatorDescription) m1VarM611).type : null;
                    if (str != null) {
                        c0031x7011f1e3.put(str, m1VarM611);
                    }
                }
            } catch (Exception unused) {
            }
            if (!c0031x7011f1e3.isEmpty()) {
                f225.f198 = c0031x7011f1e3;
            }
            boolean z = c2.f33;
            File file = new File(b3.f17.getCacheDir(), "mundo_legacy_accounts.bin");
            if (file.exists()) {
                byte[] bytes = FilesKt.readBytes(file);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bytes, 0, bytes.length);
                parcelObtain.setDataPosition(0);
                int i = parcelObtain.readInt();
                ArrayList arrayList = new ArrayList(i);
                IntIterator it2 = RangesKt.until(0, i).iterator();
                while (it2.hasNext()) {
                    it2.nextInt();
                    try {
                        C0068 c0068 = new C0068(parcelObtain);
                        if (c0031x7011f1e3.containsKey(c0068.f516.type)) {
                            arrayList.add(c0068);
                        }
                    } catch (Throwable unused2) {
                    }
                }
                parcelObtain.recycle();
                f225.f197 = arrayList;
            }
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化, reason: contains not printable characters */
    public static final void m302x4f52efc() {
        try {
            boolean z = c2.f33;
            File file = new File(b3.f17.getCacheDir(), "mundo_legacy_accounts.bin");
            ArrayList arrayList = f225.f197;
            if (arrayList.isEmpty()) {
                file.delete();
                return;
            }
            ArrayList<C0068> arrayList2 = new ArrayList(arrayList);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInt(arrayList2.size());
            for (C0068 c0068 : arrayList2) {
                parcelObtain.writeParcelable(c0068.f516, 0);
                parcelObtain.writeString(c0068.f517);
                parcelObtain.writeSerializable(new LinkedHashMap(c0068.f518));
                parcelObtain.writeSerializable(new LinkedHashMap(c0068.f519));
                parcelObtain.writeLong(c0068.f520xaa30c2c7);
            }
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            FilesKt.writeBytes(file, bArrMarshall);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public static final void m303dj() {
        try {
            boolean z = AbstractC0065x6082d607.f498;
            if (AbstractC0065x6082d607.f502xaa30c2c7) {
                f224.getClass();
                w3.f375.mo87(new Intent("android.accounts.action.VISIBLE_ACCOUNTS_CHANGED").setFlags(1073741824), (String) null);
            }
            f224.getClass();
            w3.f375.mo87(new Intent("android.accounts.LOGIN_ACCOUNTS_CHANGED"), (String) null);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样, reason: contains not printable characters */
    public static void m305x541a43c1() {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f467.execute(m3::m302x4f52efc);
    }

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public static void m308() {
        m305x541a43c1();
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f467.execute(m3::m303dj);
    }

    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public static void m3095() {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f467.execute(m3::m301);
    }

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static boolean m310(Account account) {
        try {
            Iterator it = f225.f197.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((C0068) it.next()).f516, account)) {
                    y9 y9Var = (y9) f225.f199.f31.f446.get(account);
                    if (y9Var != null) {
                        y9Var.m577();
                    }
                    it.remove();
                    m305x541a43c1();
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final String mo25(Account account, String str) {
        if (account == null || str == null) {
            return null;
        }
        try {
            for (C0068 c0068 : f225.f197) {
                if (Intrinsics.areEqual(c0068.f516, account)) {
                    return (String) c0068.f518.get(str);
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo30(IBinder iBinder, String str, String[] strArr) {
        if (iBinder == null || str == null) {
            return;
        }
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    new m(IAccountManagerResponse.Stub.asInterface(iBinder), str, strArr).m1125();
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        Account[] accountArrMo28 = mo28(str);
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("accounts", accountArrMo28);
        try {
            IAccountManagerResponse.Stub.asInterface(iBinder).onResult(bundle);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m306(IBinder iBinder, Account[] accountArr) {
        try {
            IAccountManagerResponse iAccountManagerResponseAsInterface = IAccountManagerResponse.Stub.asInterface(iBinder);
            if (iAccountManagerResponseAsInterface == null) {
                return;
            }
            m307(iAccountManagerResponseAsInterface, accountArr);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m307(IAccountManagerResponse iAccountManagerResponse, Account[] accountArr) {
        if (accountArr.length == 0) {
            try {
                iAccountManagerResponse.onResult(new Bundle());
                return;
            } catch (Exception unused) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", accountArr[0].name);
        bundle.putString("accountType", accountArr[0].type);
        try {
            iAccountManagerResponse.onResult(bundle);
        } catch (Exception unused2) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final String mo35(Account account, String str) {
        if (account == null || str == null) {
            return null;
        }
        try {
            for (C0068 c0068 : f225.f197) {
                if (Intrinsics.areEqual(c0068.f516, account)) {
                    return (String) c0068.f519.get(str);
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo36(Account account, String str, String str2) {
        if (account == null || str == null) {
            return;
        }
        try {
            for (C0068 c0068 : f225.f197) {
                if (Intrinsics.areEqual(c0068.f516, account)) {
                    C0031x7011f1e3 c0031x7011f1e3 = c0068.f519;
                    if (str2 == null) {
                        c0031x7011f1e3.remove(str);
                    } else {
                        c0031x7011f1e3.put(str, str2);
                    }
                    m305x541a43c1();
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo32(IBinder iBinder, Account account, boolean z) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new v8(IAccountManagerResponse.Stub.asInterface(iBinder), account, z).m1125();
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final boolean mo33(Account account) {
        if (account == null) {
            return false;
        }
        return m310(account);
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo34(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            k3 k3Var = f225;
            k3Var.f199.f31.m585(str, str2);
            for (C0068 c0068 : k3Var.f197) {
                if (Intrinsics.areEqual(c0068.f516.type, str)) {
                    if (c0068.f519.values().remove(str2)) {
                        m305x541a43c1();
                        return;
                    }
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final boolean mo44(Account account) {
        if (account == null) {
            return false;
        }
        try {
            for (C0068 c0068 : f225.f197) {
                if (Intrinsics.areEqual(c0068.f516, account)) {
                    c0068.f520xaa30c2c7 = System.currentTimeMillis();
                    m305x541a43c1();
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo37(Account account, String str) {
        if (account == null) {
            return;
        }
        try {
            for (C0068 c0068 : f225.f197) {
                if (Intrinsics.areEqual(c0068.f516, account)) {
                    c0068.f517 = str;
                    c0068.f519.clear();
                    y9 y9Var = (y9) f225.f199.f31.f446.get(account);
                    if (y9Var != null) {
                        y9Var.m577();
                    }
                    m308();
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo38(Account account, String str, String str2) {
        if (account == null || str == null) {
            return;
        }
        try {
            for (C0068 c0068 : f225.f197) {
                if (Intrinsics.areEqual(c0068.f516, account)) {
                    C0031x7011f1e3 c0031x7011f1e3 = c0068.f518;
                    if (str2 == null) {
                        if (c0031x7011f1e3.remove(str) != null) {
                            m305x541a43c1();
                            return;
                        }
                        return;
                    } else {
                        c0031x7011f1e3.put(str, str2);
                        m305x541a43c1();
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0007, B:10:0x0017, B:12:0x001d, B:15:0x0032, B:22:0x004c, B:25:0x0057, B:27:0x005e, B:28:0x006f, B:29:0x007a, B:30:0x0082, B:30:0x0082, B:35:0x0093, B:38:0x00a2, B:40:0x00a8, B:41:0x00b6, B:42:0x00c1, B:43:0x00c5, B:44:0x00cd, B:45:0x00d8, B:47:0x00e1, B:49:0x00ea, B:50:0x00ef, B:51:0x00f4, B:55:0x0110), top: B:58:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0007, B:10:0x0017, B:12:0x001d, B:15:0x0032, B:22:0x004c, B:25:0x0057, B:27:0x005e, B:28:0x006f, B:29:0x007a, B:30:0x0082, B:30:0x0082, B:35:0x0093, B:38:0x00a2, B:40:0x00a8, B:41:0x00b6, B:42:0x00c1, B:43:0x00c5, B:44:0x00cd, B:45:0x00d8, B:47:0x00e1, B:49:0x00ea, B:50:0x00ef, B:51:0x00f4, B:55:0x0110), top: B:58:0x0007 }] */
    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo39(IBinder iBinder, Account account, String str, boolean z, boolean z2, Bundle bundle) {
        aa aaVarM73;
        if (iBinder == null) {
            return;
        }
        try {
            IAccountManagerResponse iAccountManagerResponseAsInterface = IAccountManagerResponse.Stub.asInterface(iBinder);
            if (account != null && str != null) {
                k3 k3Var = f225;
                m1 m1Var = (m1) k3Var.f198.get(account.type);
                boolean z3 = m1Var != null && ((AuthenticatorDescription) m1Var).customTokens;
                try {
                    if (!z3) {
                        String strMo35 = mo35(account, str);
                        if (strMo35 != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("authtoken", strMo35);
                            bundle2.putString("authAccount", account.name);
                            bundle2.putString("accountType", account.type);
                            iAccountManagerResponseAsInterface.onResult(bundle2);
                        } else {
                            if (z3) {
                                aaVarM73 = k3Var.f199.m73(account, str);
                                if (aaVarM73 != null) {
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("authtoken", aaVarM73.f9);
                                    bundle3.putLong("android.accounts.expiry", aaVarM73.f10);
                                    bundle3.putString("authAccount", account.name);
                                    bundle3.putString("accountType", account.type);
                                    iAccountManagerResponseAsInterface.onResult(bundle3);
                                }
                            }
                            new i3(iAccountManagerResponseAsInterface, z2, account, str, bundle, z3, z, account.type, account.name).m1125();
                            return;
                        }
                    } else {
                        if (z3) {
                            aaVarM73 = k3Var.f199.m73(account, str);
                            if (aaVarM73 != null) {
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("authtoken", aaVarM73.f9);
                                bundle4.putLong("android.accounts.expiry", aaVarM73.f10);
                                bundle4.putString("authAccount", account.name);
                                bundle4.putString("accountType", account.type);
                                iAccountManagerResponseAsInterface.onResult(bundle4);
                            }
                        }
                        new i3(iAccountManagerResponseAsInterface, z2, account, str, bundle, z3, z, account.type, account.name).m1125();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            iAccountManagerResponseAsInterface.onError(7, "argument should not be null");
        } catch (Throwable unused2) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo40(IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle) {
        if (iBinder == null || str == null) {
            return;
        }
        try {
            new c3(str, z, str2, strArr, bundle, IAccountManagerResponse.Stub.asInterface(iBinder)).m1125();
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo41(IBinder iBinder, Account account, String str, boolean z, Bundle bundle) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new l3(z, account, str, bundle, IAccountManagerResponse.Stub.asInterface(iBinder), account.type, account.name).m1125();
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo42(IBinder iBinder, String str, boolean z) {
        if (iBinder == null || str == null) {
            return;
        }
        try {
            new g3(str, z, IAccountManagerResponse.Stub.asInterface(iBinder)).m1125();
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo43(IBinder iBinder, Account account, Bundle bundle, boolean z) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new d3(z, account, bundle, IAccountManagerResponse.Stub.asInterface(iBinder), account.type, account.name).m1125();
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo45(IBinder iBinder, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            new j3(str, str2, IAccountManagerResponse.Stub.asInterface(iBinder)).m1125();
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo46(IBinder iBinder, Account account, String str) {
        Account account2;
        if (account == null || str == null) {
            return;
        }
        try {
            if (str.length() > 200) {
                return;
            }
            Account account3 = null;
            for (C0068 c0068 : f225.f197) {
                if (Intrinsics.areEqual(c0068.f516, account)) {
                    account3 = account2;
                    account2 = new Account(str, account.type);
                    c0068.f516 = account2;
                    y9 y9Var = (y9) f225.f199.f31.f446.get(account);
                    if (y9Var != null) {
                        y9Var.m577();
                    }
                    m308();
                    break;
                }
            }
            Account account4 = account3;
            Bundle bundle = new Bundle();
            String str2 = account4 != null ? account3.name : null;
            Account account5 = account3;
            bundle.putString("authAccount", str2);
            bundle.putString("accountType", account5 != null ? account3.type : null);
            IAccountManagerResponse iAccountManagerResponseAsInterface = IAccountManagerResponse.Stub.asInterface(iBinder);
            if (iAccountManagerResponseAsInterface != null) {
                iAccountManagerResponseAsInterface.onResult(bundle);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo47(IBinder iBinder, Account account) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new f3(IAccountManagerResponse.Stub.asInterface(iBinder), account, account.type, account.name).m1125();
        } catch (Throwable unused) {
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final boolean mo48(Account account, String str, Bundle bundle, Map map) {
        C0068 c0068;
        if (account == null) {
            return false;
        }
        C0068 c0069 = null;
        try {
            for (C0068 c00610 : f225.f197) {
                if (Intrinsics.areEqual(c00610.f516, account)) {
                    c0069 = c00610;
                    break;
                }
            }
            if (c0069 == null) {
                c0069 = c0068;
                c0068 = new C0068(account);
                f225.f197.add(c0069);
            }
            c0069.f517 = str;
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof String) {
                        c0069.f518.put(str2, obj);
                    }
                }
            }
            m308();
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // top.bienvenido.date_24323.b0
    /* JADX INFO: renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了 */
    public final HashMap mo49(String str, String str2) {
        try {
            if (str == null) {
                return new HashMap();
            }
            HashMap map = new HashMap();
            for (C0068 c0068 : f225.f197) {
                if (str2 == null || Intrinsics.areEqual(c0068.f516.type, str2)) {
                    map.put(c0068.f516, 1);
                }
            }
            return map;
        } catch (Exception unused) {
            if (str2 == null) {
                str2 = "";
            }
            return MapsKt.hashMapOf(new Pair[]{TuplesKt.to(new Account(str2, "name"), 1)});
        }
    }
}
