package top.bienvenido.date_24323;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/c0.class */
public final class c0 implements f0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f32;

    public c0(IBinder iBinder) {
        this.f32 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder mo75(String str, String str2, ProviderInfo[] providerInfoArr, String[] strArr, int i) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(providerInfoArr.length);
            parcelObtain.writeInt(strArr.length);
            parcelObtain.writeInt(i);
            this.f32.transact(1, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readStrongBinder();
            Obtain.readTypedArray(providerInfoArr, ProviderInfo.CREATOR);
            Obtain.readStringArray(strArr);
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public final ComponentName mo76xaa30c2c7(Intent intent, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            this.f32.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ComponentName) (parcelObtain2.readInt() != 0 ? ComponentName.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final int mo77(Intent intent, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            this.f32.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final int mo79(Intent intent, IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            this.f32.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final ArrayList mo83(int i) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            parcelObtain.writeInt(i);
            this.f32.transact(9, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final String[] mo84(int i) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            parcelObtain.writeInt(i);
            this.f32.transact(10, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.createStringArray();
            Obtain.recycle();
            parcelObtain.recycle();
            return Obtain;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public final void mo925(String str) {
        ?? Obtain = Parcel.obtain();
        Parcel parcelObtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoActivityManagerService");
            Obtain.writeString(str);
            this.f32.transact(18, Obtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            Obtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final void mo88(String str, String str2) {
        ?? Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoActivityManagerService");
            Obtain.writeString(str);
            Obtain.writeString(str2);
            this.f32.transact(14, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final boolean mo89(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f32.transact(15, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readInt();
            boolean z = Obtain != 0;
            Obtain.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IBinder] */
    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final boolean mo80(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        ?? Obtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            this.f32.transact(6, parcelObtain, Obtain, 0);
            Obtain.readException();
            Obtain = Obtain.readInt();
            boolean z = Obtain != 0;
            Obtain.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            Obtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final void mo86(IBinder iBinder) {
        ?? Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoActivityManagerService");
            Obtain.writeStrongBinder(iBinder);
            this.f32.transact(12, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final boolean mo78(ComponentName componentName, IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i);
            this.f32.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final void mo90() {
        ?? Obtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoActivityManagerService");
            this.f32.transact(16, Obtain, null, 1);
            Obtain.recycle();
        } catch (Throwable th) {
            th.recycle();
            throw Obtain;
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final int mo87(Intent intent, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            this.f32.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final IBinder mo91(Intent intent, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            this.f32.transact(17, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final boolean mo81(IBinder iBinder, Intent intent, IBinder iBinder2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            parcelObtain.writeStrongBinder(iBinder);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStrongBinder(iBinder2);
            this.f32.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder mo82(ComponentName componentName, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            this.f32.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo85(int i, IBinder iBinder, IntentFilter intentFilter) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoActivityManagerService");
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            if (intentFilter != null) {
                parcelObtain.writeInt(1);
                intentFilter.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f32.transact(11, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcel, java.lang.Throwable] */
    @Override // top.bienvenido.date_24323.f0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo93(String str, String str2, String str3) {
        ?? Obtain = Parcel.obtain();
        Parcel parcelObtain = Parcel.obtain();
        try {
            Obtain.writeInterfaceToken("MundoActivityManagerService");
            Obtain.writeString(str);
            Obtain.writeString(str2);
            Obtain.writeString(str3);
            this.f32.transact(19, Obtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            Obtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            th.recycle();
            throw Obtain;
        }
    }
}
