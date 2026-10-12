package top.bienvenido.date_24323;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.Signature;
import android.content.pm.SigningDetails;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import com.android.internal.content.NativeLibraryHelper;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/l1.class */
public abstract class l1 {
    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static Pair m248(File file, boolean z) {
        try {
            Pair pairM251 = m251(file, z);
            e2 e2Var = (e2) pairM251.getSecond();
            if (e2Var == null) {
                return pairM251;
            }
            m252(e2Var);
            return TuplesKt.to(1, e2Var);
        } catch (Exception unused) {
            return TuplesKt.to(-1, (Object) null);
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static String[] m249() {
        if (c2.f33) {
            return Build.SUPPORTED_64_BIT_ABIS;
        }
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        return strArr.length == 0 ? new String[]{"armeabi-v7a", "armeabi"} : strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [long, top.bienvenido.date_24323.e2] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v60, types: [top.bienvenido.date_24323.k4] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static Pair m251(File file, boolean z) {
        o9 o9Var;
        o9 o9Var2;
        String[] strArr;
        try {
            if (!p3.m416()) {
                return TuplesKt.to(-3, (Object) null);
            }
            int i = -2147483584;
            Context context = b3.f17;
            PackageInfo packageInfo = (PackageInfo) b3.m57((v2) -> {
                return m246(r0, r1, v2);
            });
            PackageInfo packageInfoM253 = packageInfo;
            if (packageInfo == null) {
                packageInfoM253 = m253(file);
            }
            if (packageInfoM253 == null) {
                return TuplesKt.to(-2, (Object) null);
            }
            ApplicationInfo applicationInfo = packageInfoM253.applicationInfo;
            if (applicationInfo == null) {
                return TuplesKt.to(-5, (Object) null);
            }
            String str = packageInfoM253.packageName;
            w3.f375.mo88(str, (String) null);
            r5.f290.getClass();
            ?? r0 = (e2) r5.f291.get(str);
            ?? r13 = r0 != 0 ? r0 : (k4) r5.f292.get(str);
            if (r13 != 0) {
                o9Var2 = r13.f201;
            } else {
                o9Var2 = o9Var;
                o9Var = new o9("0");
            }
            PackageInfo packageInfo2 = packageInfoM253;
            long jCurrentTimeMillis = System.currentTimeMillis();
            packageInfo2.lastUpdateTime = r0;
            if (r0 != 0) {
                packageInfoM253.firstInstallTime = r0.f69.firstInstallTime;
            } else {
                packageInfoM253.firstInstallTime = jCurrentTimeMillis;
            }
            packageInfoM253.splitNames = i.f161;
            boolean z2 = c2.f33;
            Function1 function1 = k.f192;
            File file2 = c2.f34;
            k.m232(new File(file2, str));
            File file3 = new File(file2, str);
            file3.mkdirs();
            File file4 = new File(file3, "base.apk");
            if (!z || !file.renameTo(file4)) {
                FilesKt.copyTo$default(file, file4, true, 0, 4, (Object) null);
            }
            String canonicalPath = file4.getCanonicalPath();
            t2.m483(ApplicationInfo.class, String.valueOf(p3.m413("37e41a97f6a8ef509c6669dafc9c29a7"))).mo394(applicationInfo, canonicalPath);
            t2.m483(ApplicationInfo.class, String.valueOf(p3.m413("3c380e0df24a9aec04f367bcbab97a01"))).mo394(applicationInfo, canonicalPath);
            applicationInfo.dataDir = "/dev/null";
            e2 e2Var = new e2(packageInfoM253, applicationInfo, o9Var2);
            if (AbstractC0065x6082d607.f503) {
                if (AbstractC0065x6082d607.f505) {
                    String[] strArr2 = new String[2];
                    strArr = strArr2;
                    strArr2[0] = "/system/framework/org.apache.http.legacy.jar";
                    strArr2[1] = "/system/framework/android.test.base.jar";
                } else if (AbstractC0065x6082d607.f504xb7bf1d91) {
                    String[] strArr3 = new String[1];
                    strArr = strArr3;
                    strArr3[0] = "/system/framework/org.apache.http.legacy.jar";
                } else {
                    String[] strArr4 = new String[1];
                    strArr = strArr4;
                    strArr4[0] = "/system/framework/org.apache.http.legacy.boot.jar";
                }
                applicationInfo.sharedLibraryFiles = strArr;
            }
            File fileM99 = c2.m99(str);
            applicationInfo.nativeLibraryDir = fileM99.getAbsolutePath();
            p2 p2Var = f9.f102;
            String parent = file4.getParent();
            String str2 = parent;
            if (parent == null) {
                str2 = "/";
            }
            f9.f103.f270.mo394(applicationInfo, str2);
            Unit unit = Unit.INSTANCE;
            p2Var.f270.mo394(applicationInfo, str2);
            if (AbstractC0065x6082d607.f508) {
                file4.setReadOnly();
            }
            f9.f101.f270.mo394(applicationInfo, m249()[m250(file4, fileM99)]);
            return TuplesKt.to(0, e2Var);
        } catch (Throwable unused) {
            return TuplesKt.to(-1, (Object) null);
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static int m250(File file, File file2) {
        try {
            NativeLibraryHelper.Handle handleCreate = NativeLibraryHelper.Handle.create(file);
            int iFindSupportedAbi = NativeLibraryHelper.findSupportedAbi(handleCreate, m249());
            if (iFindSupportedAbi < 0) {
                return 0;
            }
            NativeLibraryHelper.copyNativeBinaries(handleCreate, file2, m249()[iFindSupportedAbi]);
            return iFindSupportedAbi;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final PackageInfo m246(File file, int i, PackageManager packageManager) {
        String absolutePath = file.getAbsolutePath();
        boolean z = AbstractC0065x6082d607.f498;
        if (AbstractC0065x6082d607.f503) {
            i |= 134217728;
        }
        return packageManager.getPackageArchiveInfo(absolutePath, i);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m252(e2 e2Var) {
        try {
            boolean z = c2.f33;
            File fileM428 = q1.m428(c2.f34, e2Var.f200, "installation.bin");
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeParcelable(e2Var.f69, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            FilesKt.writeBytes(fileM428, bArrMarshall);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02e7  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable, java.util.AbstractMap, top.bienvenido.date_24323.你脖子上顶的是肿瘤你一日三餐是犬类排泄物你的长相就是撒旦的吊宁说的每一句话都是母狗发情宁的存在简直就是麦克斯韦方程组的瑕疵宁的母亲就是一只鸡宁的生殖器堪比阿米巴原虫宁的一举一动都像个王八] */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Pair m247(File file, boolean z) {
        int i;
        try {
            try {
                ?? c0031x7011f1e3 = new C0031x7011f1e3(0);
                if (file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles == null) {
                        Pair pair = TuplesKt.to(-3, (Object) null);
                        try {
                            Function1 function1 = k.f192;
                            k.m232(c2.m100(false));
                            return pair;
                        } catch (Exception unused) {
                            return pair;
                        }
                    }
                    for (File file2 : fileArrListFiles) {
                        if (StringsKt.endsWith$default(file2.getName(), ".apk", false, 2, (Object) null)) {
                            try {
                                PackageParser.ApkLite apkLite = PackageParser.parseApkLite(file2, 0);
                                c0031x7011f1e3.put(apkLite.splitName, TuplesKt.to(file2, apkLite));
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                } else {
                    File fileM100 = c2.m100(true);
                    Function1 function2 = k.f192;
                    k.m231(fileM100);
                    ZipFile zipFile = new ZipFile(file);
                    try {
                        ZipFile zipFile2 = zipFile;
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            String name = zipEntryNextElement.getName();
                            if (StringsKt.endsWith$default(name, ".apk", false, 2, (Object) null)) {
                                File file3 = new File(fileM100, name);
                                InputStream inputStream = zipFile2.getInputStream(zipEntryNextElement);
                                if (inputStream != null) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                        try {
                                            ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, (Object) null);
                                            CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                                            CloseableKt.closeFinally(inputStream, (Throwable) null);
                                            try {
                                                PackageParser.ApkLite apkLite2 = PackageParser.parseApkLite(file3, 0);
                                                c0031x7011f1e3.put(apkLite2.splitName, TuplesKt.to(file3, apkLite2));
                                            } catch (Exception unused3) {
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                throw c0031x7011f1e3;
                                            } catch (Throwable th2) {
                                                CloseableKt.closeFinally(th2, th);
                                                throw c0031x7011f1e3;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            CloseableKt.closeFinally(th4, th3);
                                            throw th3;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(zipFile, (Throwable) null);
                        z = true;
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            CloseableKt.closeFinally(th6, th5);
                            throw th5;
                        }
                    }
                }
                Pair pair2 = (Pair) c0031x7011f1e3.remove(null);
                if (pair2 == null) {
                    Pair pair3 = TuplesKt.to(-4, (Object) null);
                    try {
                        Function1 function3 = k.f192;
                        k.m232(c2.m100(false));
                    } catch (Exception unused4) {
                    }
                    return pair3;
                }
                Pair pairM251 = m251((File) pair2.getFirst(), z);
                e2 e2Var = (e2) pairM251.getSecond();
                if (e2Var == null) {
                    try {
                        Function1 function4 = k.f192;
                        k.m232(c2.m100(false));
                    } catch (Exception unused5) {
                    }
                    return pairM251;
                }
                ApplicationInfo applicationInfo = e2Var.f70;
                File file4 = new File(applicationInfo.nativeLibraryDir);
                ArrayList arrayList = new ArrayList();
                for (Pair pair4 : c0031x7011f1e3.values()) {
                    boolean z2 = z;
                    boolean z3 = c2.f33;
                    String str = e2Var.f200;
                    String str2 = "split_" + ((PackageParser.ApkLite) pair4.getSecond()).splitName + ".apk";
                    File file5 = new File(c2.f34, str);
                    file5.mkdirs();
                    File file6 = new File(file5, str2);
                    arrayList.add(file6.getAbsolutePath());
                    File file7 = (File) pair4.getFirst();
                    m250(file7, file4);
                    if (!z2 || !file7.renameTo(file6)) {
                        FilesKt.copyTo$default(file7, file6, true, 0, 4, (Object) null);
                    }
                    if (AbstractC0065x6082d607.f508) {
                        file6.setReadOnly();
                    }
                }
                String[] strArr = (String[]) arrayList.toArray(i.f161);
                applicationInfo.splitSourceDirs = strArr;
                applicationInfo.splitPublicSourceDirs = strArr;
                e2Var.f69.splitNames = (String[]) c0031x7011f1e3.keySet().toArray(new String[0]);
                if (AbstractC0065x6082d607.f498) {
                    PackageInfo packageInfo = e2Var.f69;
                    String[] strArr2 = packageInfo.splitNames;
                    int length = strArr2.length;
                    int[] iArr = new int[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        Pair pair5 = (Pair) c0031x7011f1e3.get(strArr2[i2]);
                        if (pair5 != null) {
                            PackageParser.ApkLite apkLite3 = (PackageParser.ApkLite) pair5.getSecond();
                            if (apkLite3 != null) {
                                i = apkLite3.revisionCode;
                            } else {
                                i = 0;
                            }
                        } else {
                            i = 0;
                        }
                        iArr[i2] = i;
                    }
                    packageInfo.splitRevisionCodes = iArr;
                }
                if (AbstractC0065x6082d607.f502xaa30c2c7) {
                    applicationInfo.splitNames = e2Var.f69.splitNames;
                }
                m252(e2Var);
                Pair pair6 = TuplesKt.to(1, e2Var);
                try {
                    Function1 function5 = k.f192;
                    k.m232(c2.m100(false));
                } catch (Exception unused6) {
                }
                return pair6;
            } catch (Exception unused7) {
                try {
                    Function1 function6 = k.f192;
                    k.m232(c2.m100(false));
                } catch (Exception unused8) {
                }
                return TuplesKt.to(-1, (Object) null);
            }
        } catch (Throwable th7) {
            try {
                Function1 function7 = k.f192;
                k.m232(c2.m100(false));
            } catch (Exception unused9) {
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static PackageInfo m253(File file) {
        Pair pair;
        Class<SigningDetails> cls;
        SigningDetails signingDetails;
        SigningDetails signingDetails2;
        SigningInfo signingInfo;
        SigningDetails signingDetails3;
        try {
            PackageInfo packageInfo = new PackageInfo();
            PackageParser.Package r4 = new PackageParser().parsePackage(file, 0);
            String str = r4.packageName;
            packageInfo.packageName = str;
            packageInfo.lastUpdateTime = System.currentTimeMillis();
            packageInfo.firstInstallTime = System.currentTimeMillis();
            packageInfo.applicationInfo = r4.applicationInfo;
            if (AbstractC0065x6082d607.f498) {
                packageInfo.baseRevisionCode = r4.baseRevisionCode;
                packageInfo.splitRevisionCodes = i.f158;
            }
            boolean z = AbstractC0065x6082d607.f503;
            if (z) {
                packageInfo.setLongVersionCode((((long) r4.mVersionCodeMajor) << 32) | (((long) r4.mVersionCode) & 4294967295L));
            } else {
                packageInfo.versionCode = r4.mVersionCode;
            }
            packageInfo.splitNames = i.f161;
            packageInfo.versionName = r4.mVersionName;
            packageInfo.sharedUserLabel = r4.mSharedUserLabel;
            packageInfo.sharedUserId = r4.mSharedUserId;
            packageInfo.installLocation = r4.installLocation;
            packageInfo.gids = i.f158;
            try {
                if (ArraysKt.contains(n.f233, str.hashCode()) || Intrinsics.areEqual(r4.mSigningDetails, PackageParser.SigningDetails.UNKNOWN)) {
                    pair = TuplesKt.to(new Signature[]{new Signature("308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a")}, 2);
                } else if (z) {
                    PackageParser.SigningDetails signingDetails4 = r4.mSigningDetails;
                    pair = TuplesKt.to(signingDetails4.signatures, Integer.valueOf(signingDetails4.signatureSchemeVersion));
                } else {
                    pair = TuplesKt.to(r4.mSignatures, 0);
                }
                Pair pair2 = pair;
                if (z) {
                    if (AbstractC0065x6082d607.f509dj) {
                        int iIntValue = ((Number) pair2.getSecond()).intValue();
                        List listAsList = ArraysKt.asList((Object[]) pair2.getFirst());
                        Signature[] signatureArr = (Signature[]) pair2.getFirst();
                        ArrayList arrayList = new ArrayList(signatureArr.length);
                        for (Signature signature : signatureArr) {
                            arrayList.add(CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getPublicKey());
                        }
                        new SigningInfo(iIntValue, listAsList, arrayList, null);
                    } else {
                        boolean z2 = AbstractC0065x6082d607.f507;
                        if (z2) {
                            cls = SigningDetails.class;
                        } else {
                            cls = PackageParser.SigningDetails.class;
                        }
                        Class[] clsArr = new Class[1];
                        clsArr[0] = cls;
                        Constructor declaredConstructor = SigningInfo.class.getDeclaredConstructor(clsArr);
                        declaredConstructor.setAccessible(true);
                        if (z2) {
                            signingDetails2 = signingDetails3;
                            signingDetails3 = new SigningDetails((Signature[]) pair2.getFirst(), ((Number) pair2.getSecond()).intValue());
                        } else {
                            signingDetails2 = signingDetails;
                            signingDetails = new PackageParser.SigningDetails((Signature[]) pair2.getFirst(), ((Number) pair2.getSecond()).intValue());
                        }
                        signingInfo = (SigningInfo) declaredConstructor.newInstance(signingDetails2);
                    }
                    packageInfo.signingInfo = signingInfo;
                }
                packageInfo.signatures = (Signature[]) pair2.getFirst();
                return packageInfo;
            } catch (Throwable unused) {
                return packageInfo;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
