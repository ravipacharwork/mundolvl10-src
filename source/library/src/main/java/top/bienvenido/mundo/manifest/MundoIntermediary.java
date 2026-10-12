package top.bienvenido.mundo.manifest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.date_24323.AbstractC0030;
import top.bienvenido.date_24323.a;
import top.bienvenido.date_24323.a1;
import top.bienvenido.date_24323.b3;
import top.bienvenido.date_24323.n6;
import top.bienvenido.date_24323.p9;
import top.bienvenido.date_24323.q1;
import top.bienvenido.date_24323.r5;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/mundo/manifest/MundoIntermediary.class */
@Metadata(mv = {2, 2, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/bienvenido/mundo/manifest/MundoIntermediary;", "Landroid/app/Activity;", "<init>", "()V", "mundo"}, xi = 48)
public final class MundoIntermediary extends Activity {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public AtomicBoolean f532 = new AtomicBoolean(true);

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        finish();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f532.set(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f532 = atomicBoolean;
        m699(intent, atomicBoolean);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m699(getIntent(), this.f532);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m697(Intent intent, String str, ActivityInfo activityInfo, Intent intent2, AtomicBoolean atomicBoolean) {
        Intent intentM382;
        try {
            intent.setComponent(new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name));
            if (str != null) {
                n6 n6Var = n6.f241;
                IBinder iBinderM5 = a1.m5(intent2, intent);
                n6Var.getClass();
                intentM382 = n6.m382(intent, str, iBinderM5, activityInfo);
            } else {
                intentM382 = null;
            }
            if (intentM382 != null) {
                intent = intentM382;
            }
            if (!q1.m427(intent.getFlags(), 268435456)) {
                intent.addFlags(33554432);
            }
            startActivity(intent);
            m696(atomicBoolean);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final void m699(Intent intent, AtomicBoolean atomicBoolean) {
        ExecutorService executorService = AbstractC0030.f466;
        AbstractC0030.f466.execute(() -> {
            m695(r0, r1, r2);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m696(AtomicBoolean atomicBoolean) {
        if (!atomicBoolean.get() || isFinishing()) {
            return;
        }
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m698(Intent intent, AtomicBoolean atomicBoolean) {
        Pair pair;
        Pair pair2;
        try {
            if (Intrinsics.areEqual(intent.getScheme(), "fbconnect")) {
                intent.setComponent(null);
                pair = pair2;
                pair2 = new Pair(intent, "0");
            } else {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        pair = null;
                    } else {
                        Intent intent2 = (Intent) extras.getParcelable("android.intent.extra.INTENT");
                        if (intent2 == null) {
                            pair = null;
                        } else {
                            String string = extras.getString(String.class.getName());
                            String str = string;
                            if (string == null) {
                                str = "0";
                            }
                            new Pair(intent2, str);
                        }
                    }
                } catch (Exception unused) {
                }
                if (pair == null) {
                    m696(atomicBoolean);
                    return;
                }
            }
            Intent intent3 = (Intent) pair.getFirst();
            List listMo271 = r5.f290.mo271(intent3, null, 0);
            ArrayList arrayList = new ArrayList();
            p9 p9Var = new p9(8);
            if (!listMo271.isEmpty()) {
                Iterator it = listMo271.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                    p9Var.m423(new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name).hashCode());
                    arrayList.add(activityInfo);
                }
            }
            Context context = b3.f17;
            b3.m57((v5) -> {
                return m690(r1, r2, r3, r4, r5, v5);
            });
            if (arrayList.isEmpty()) {
                m696(atomicBoolean);
                return;
            }
            if (arrayList.size() == 1) {
                Pair pair3 = pair;
                ActivityInfo activityInfo2 = (ActivityInfo) arrayList.get(0);
                if (Intrinsics.areEqual(((Intent) pair3.getFirst()).getScheme(), "fbconnect")) {
                    n6.f241.mo330(((Intent) pair.getFirst()).setComponent(new ComponentName(((ComponentInfo) activityInfo2).packageName, ((ComponentInfo) activityInfo2).name)), (String) pair.getSecond());
                    return;
                } else {
                    m697(intent3, !r5.f290.mo263x541a43c1(activityInfo2.packageName) ? null : (String) pair.getSecond(), activityInfo2, intent, atomicBoolean);
                    return;
                }
            }
            PackageManager packageManager = getPackageManager();
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                int i2 = i;
                ActivityInfo activityInfo3 = (ActivityInfo) arrayList.get(i);
                strArr[i2] = activityInfo3.loadLabel(packageManager) + " (" + activityInfo3.packageName + ")";
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            Pair pair4 = pair;
            builder.setItems(strArr, (v6, v7) -> {
                m691(r9, r10, r11, r12, r13, r14, v6, v7);
            });
            builder.setNegativeButton("X", (v2, v3) -> {
                m692(r6, r7, v2, v3);
            });
            builder.setOnDismissListener((v2) -> {
                m693(r3, r4, v2);
            });
            runOnUiThread(() -> {
                m694(r1);
            });
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m690(Intent intent, p9 p9Var, MundoIntermediary mundoIntermediary, Intent intent2, ArrayList arrayList, PackageManager packageManager) {
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 131072).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (a.m2(p9Var.f276, p9Var.f277, new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name).hashCode()) < 0 && (!Intrinsics.areEqual(activityInfo.packageName, mundoIntermediary.getPackageName()) || !Intrinsics.areEqual(intent2.getScheme(), "fbconnect"))) {
                arrayList.add(activityInfo);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m691(ArrayList arrayList, MundoIntermediary mundoIntermediary, Intent intent, Pair pair, Intent intent2, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        try {
            ActivityInfo activityInfo = (ActivityInfo) arrayList.get(i);
            mundoIntermediary.m697(intent, r5.f290.mo263x541a43c1(activityInfo.packageName) ? (String) pair.getSecond() : null, activityInfo, intent2, atomicBoolean);
        } catch (Exception unused) {
            mundoIntermediary.m696(atomicBoolean);
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m692(MundoIntermediary mundoIntermediary, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        mundoIntermediary.m696(atomicBoolean);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m693(MundoIntermediary mundoIntermediary, AtomicBoolean atomicBoolean, DialogInterface dialogInterface) {
        mundoIntermediary.m696(atomicBoolean);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m694(AlertDialog.Builder builder) {
        try {
            builder.show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m695(MundoIntermediary mundoIntermediary, Intent intent, AtomicBoolean atomicBoolean) {
        mundoIntermediary.m698(intent, atomicBoolean);
    }
}
