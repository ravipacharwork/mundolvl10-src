package top.bienvenido.mundo.supervisor;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import top.bienvenido.date_24323.b1;
import top.bienvenido.date_24323.b3;
import top.bienvenido.date_24323.e4;
import top.bienvenido.date_24323.e5;
import top.bienvenido.date_24323.l6;
import top.bienvenido.date_24323.m3;
import top.bienvenido.date_24323.n6;
import top.bienvenido.date_24323.o3;
import top.bienvenido.date_24323.p3;
import top.bienvenido.date_24323.p4;
import top.bienvenido.date_24323.q4;
import top.bienvenido.date_24323.r5;
import top.bienvenido.date_24323.w3;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/mundo/supervisor/MundoSupervisorProvider.class */
@Metadata(mv = {2, 2, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/bienvenido/mundo/supervisor/MundoSupervisorProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "mundo"}, xi = 48)
public final class MundoSupervisorProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = b3.f17;
        p3.m411();
        l6.f212xaa30c2c7.f185 = n6.f241;
        e5.f77xaa30c2c7.f185 = r5.f290;
        p4.f271xaa30c2c7.f185 = q4.f280;
        e4.f76xaa30c2c7.f185 = w3.f375;
        o3.f261xaa30c2c7.f185 = m3.f224;
        return true;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        b1.f11.getClass();
        return b1.f12;
    }

    @Override // android.content.ContentProvider
    public final /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final /* bridge */ /* synthetic */ String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final /* bridge */ /* synthetic */ Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }
}
