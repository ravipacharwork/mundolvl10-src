package top.bienvenido.date_24323;

import android.content.ClipData;
import android.content.ContentProvider;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/r8.class */
public abstract class r8 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final String f297 = b3.f18 + ".provider.stub";

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final p2 f298 = new p2("mLocalProvider");

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static String m470(String str) {
        try {
            h6 h6Var = h6.f130;
            Map map = h6.f154x4b3a412e;
            h6Var.getClass();
            Object obj = map.get(h6.f153.newInstance(str, Integer.valueOf(b3.f20)));
            if (obj != null && f298.f270.mo393(obj) != null) {
                return f297 + f4.f97xb7bf1d91;
            }
            Triple tripleM635 = SM.m635(str);
            if (tripleM635.getFirst() != null) {
                return (String) tripleM635.getSecond();
            }
            if (tripleM635.getThird() != null) {
                return f297 + f4.f97xb7bf1d91;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static Uri m471(Uri uri) {
        try {
            if (Intrinsics.areEqual(uri.getScheme(), "content")) {
                String authority = uri.getAuthority();
                if (authority != null) {
                    String strM470 = m470(authority);
                    if (strM470 != null) {
                        return Uri.parse("content://" + strM470 + "/" + uri.toString().substring(10));
                    }
                }
            } else if (Intrinsics.areEqual(uri.getScheme(), "package") && Intrinsics.areEqual(uri.getSchemeSpecificPart(), f4.f92)) {
                return Uri.fromParts("package", b3.f18, null);
            }
            return uri;
        } catch (Exception unused) {
            return uri;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Pair m468(Uri uri) {
        try {
            String str = "content://" + (f297 + f4.f97xb7bf1d91) + "/";
            if (!StringsKt.startsWith$default(uri.toString(), str, false, 2, (Object) null)) {
                return null;
            }
            Uri uri2 = Uri.parse("content://" + uri.toString().substring(str.length()));
            p2 p2Var = f298;
            h6 h6Var = h6.f130;
            String authority = uri2.getAuthority();
            Map map = h6.f154x4b3a412e;
            h6Var.getClass();
            Object obj = map.get(h6.f153.newInstance(authority, Integer.valueOf(b3.f20)));
            if (obj == null) {
                return null;
            }
            ContentProvider contentProvider = (ContentProvider) p2Var.f270.mo393(obj);
            if (contentProvider == null) {
                return null;
            }
            return TuplesKt.to(uri2, contentProvider);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m472(Intent intent, String str) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Object obj = extras.get(str);
                if (obj instanceof Uri) {
                    intent.putExtra(str, m471((Uri) obj));
                    return;
                }
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = new ArrayList(((ArrayList) obj).size());
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        arrayList.add(m471((Uri) it.next()));
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    intent.putExtra(str, arrayList);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Intent m469(Intent intent) {
        try {
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            if (intent2 != null) {
                intent.putExtra("android.intent.extra.INTENT", m469(intent2));
            }
            if (intent.hasExtra("app_package")) {
                intent.putExtra("app_package", b3.f18);
            }
            if (AbstractC0065x6082d607.f502xaa30c2c7 && intent.hasExtra("android.provider.extra.APP_PACKAGE")) {
                intent.putExtra("android.provider.extra.APP_PACKAGE", b3.f18);
            }
            Uri data = intent.getData();
            if (data != null) {
                intent.setDataAndType(m471(data), intent.getType());
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null && clipData.getItemCount() >= 0) {
                ClipData.Item itemAt = clipData.getItemAt(0);
                Uri uri = itemAt.getUri();
                if (uri != null) {
                    Uri uriM471 = m471(uri);
                    if (!Intrinsics.areEqual(uriM471, uri)) {
                        ClipData clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(itemAt.getText(), itemAt.getHtmlText(), itemAt.getIntent(), uriM471));
                        int itemCount = clipData.getItemCount();
                        for (int i = 1; i < itemCount; i++) {
                            ClipData.Item itemAt2 = clipData.getItemAt(i);
                            Uri uri2 = itemAt2.getUri();
                            Uri uriM472 = uri2;
                            if (uri2 != null) {
                                uriM472 = m471(uriM472);
                            }
                            clipData2.addItem(new ClipData.Item(itemAt2.getText(), itemAt2.getHtmlText(), itemAt2.getIntent(), uriM472));
                        }
                        intent.setClipData(clipData2);
                    }
                }
            }
            if (intent.hasExtra("output")) {
                m472(intent, "output");
            }
            if (intent.hasExtra("android.intent.extra.STREAM")) {
                m472(intent, "android.intent.extra.STREAM");
            }
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.intent.extra.INITIAL_INTENTS");
            if (parcelableArrayExtra == null) {
                return intent;
            }
            int length = parcelableArrayExtra.length;
            Intent[] intentArr = new Intent[length];
            for (int i2 = 0; i2 < length; i2++) {
                intentArr[i2] = m469((Intent) parcelableArrayExtra[i2]);
            }
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
            return intent;
        } catch (Exception unused) {
            return intent;
        }
    }
}
