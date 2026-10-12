package top.bienvenido.date_24323;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/v5.class */
public abstract class v5 extends ContentProvider {
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = b3.f17;
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        Pair pairM468 = r8.m468(uri);
        if (pairM468 == null) {
            return null;
        }
        try {
            return ((ContentProvider) pairM468.getSecond()).openFile((Uri) pairM468.getFirst(), str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        Pair pairM468 = r8.m468(uri);
        if (pairM468 == null) {
            return null;
        }
        try {
            return ((ContentProvider) pairM468.getSecond()).getStreamTypes((Uri) pairM468.getFirst(), str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final boolean refresh(Uri uri, Bundle bundle, CancellationSignal cancellationSignal) {
        Pair pairM468;
        String str = r8.f297;
        if (uri == null || (pairM468 = r8.m468(uri)) == null) {
            return false;
        }
        try {
            return ((ContentProvider) pairM468.getSecond()).refresh((Uri) pairM468.getFirst(), bundle, cancellationSignal);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Pair pairM468 = r8.m468(uri);
        if (pairM468 == null) {
            return null;
        }
        try {
            return ((ContentProvider) pairM468.getSecond()).query((Uri) pairM468.getFirst(), strArr, str, strArr2, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        Pair pairM468 = r8.m468(uri);
        if (pairM468 == null) {
            return null;
        }
        try {
            return ((ContentProvider) pairM468.getSecond()).getType((Uri) pairM468.getFirst());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        Pair pairM468 = r8.m468(uri);
        if (pairM468 == null) {
            return null;
        }
        try {
            return ((ContentProvider) pairM468.getSecond()).insert((Uri) pairM468.getFirst(), contentValues);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        Pair pairM468 = r8.m468(uri);
        if (pairM468 == null) {
            return 0;
        }
        try {
            return ((ContentProvider) pairM468.getSecond()).delete((Uri) pairM468.getFirst(), str, strArr);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Pair pairM468 = r8.m468(uri);
        if (pairM468 == null) {
            return 0;
        }
        try {
            return ((ContentProvider) pairM468.getSecond()).update((Uri) pairM468.getFirst(), contentValues, str, strArr);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Binder, android.os.IBinder, java.lang.Throwable, top.bienvenido.date_24323.h6] */
    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        try {
            if (f4.f97xb7bf1d91 == 0) {
                f4.f97xb7bf1d91 = Integer.parseInt(str);
                if (bundle != null) {
                    l6 l6Var = l6.f212xaa30c2c7;
                    e5 e5Var = e5.f77xaa30c2c7;
                    e4 e4Var = e4.f76xaa30c2c7;
                    p4 p4Var = p4.f271xaa30c2c7;
                    o3 o3Var = o3.f261xaa30c2c7;
                    ArrayList arrayList = j4.f182;
                    i4.m210(bundle);
                    n.f232 = bundle.getBoolean("mundo_base_bundle", false);
                }
                Context context = b3.f17;
                context.startService(new Intent(context, (Class<?>) MundoService$Companion$STUB.class));
            }
        } catch (Exception unused) {
        }
        ?? r0 = h6.f130;
        synchronized (r0) {
            try {
                h6.f143.invoke();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw r0;
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBinder("user_handler", r0);
        bundle2.putBoolean(r0.getInterfaceDescriptor(), f4.f91);
        bundle2.putInt("user_pid", Process.myPid());
        return bundle2;
    }
}
