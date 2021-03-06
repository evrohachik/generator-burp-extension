package <%= package %>.scanner;

import burp.IHttpRequestResponse;
import burp.IScanIssue;
import burp.IScannerCheck;
import burp.IScannerInsertionPoint;

import java.util.List;

public class ScannerCheck implements IScannerCheck {


    private static ScannerCheck mInstance;

    private ScannerCheck() {
    }

    public static ScannerCheck getInstance() {
        if (mInstance == null) {
            mInstance = new ScannerCheck();
        }
        return mInstance;
    }

    /**
     * The Scanner invokes this method for each base request / response that is
     * passively scanned. <b>Note:</b> Extensions should only analyze the
     * HTTP messages provided during passive scanning, and should not make any
     * new HTTP requests of their own.
     *
     * @param baseRequestResponse The base HTTP request / response that should
     *                            be passively scanned.
     * @return A list of <code>IScanIssue</code> objects, or <code>null</code>
     * if no issues are identified.
     */
    @Override
    public List<IScanIssue> doPassiveScan(IHttpRequestResponse baseRequestResponse) {
        // TODO:
        return null;
    }

    /**
     * The Scanner invokes this method for each insertion point that is actively
     * scanned. Extensions may issue HTTP requests as required to carry out
     * active scanning, and should use the
     * <code>IScannerInsertionPoint</code> object provided to build scan
     * requests for particular payloads.
     * <b>Note:</b>
     * Scan checks should submit raw non-encoded payloads to insertion points,
     * and the insertion point has responsibility for performing any data
     * encoding that is necessary given the nature and location of the insertion
     * point.
     *
     * @param baseRequestResponse The base HTTP request / response that should
     *                            be actively scanned.
     * @param insertionPoint      An <code>IScannerInsertionPoint</code> object that
     *                            can be queried to obtain details of the insertion point being tested, and
     *                            can be used to build scan requests for particular payloads.
     * @return A list of <code>IScanIssue</code> objects, or <code>null</code>
     * if no issues are identified.
     */
    @Override
    public List<IScanIssue> doActiveScan(
            IHttpRequestResponse baseRequestResponse, IScannerInsertionPoint insertionPoint
    ) {
        // TODO:
        return null;
    }

    /**
     * The Scanner invokes this method when the custom Scanner check has
     * reported multiple issues for the same URL path. This can arise either
     * because there are multiple distinct vulnerabilities, or because the same
     * (or a similar) request has been scanned more than once. The custom check
     * should determine whether the issues are duplicates. In most cases, where
     * a check uses distinct issue names or descriptions for distinct issues,
     * the consolidation process will simply be a matter of comparing these
     * features for the two issues.
     *
     * @param existingIssue An issue that was previously reported by this
     *                      Scanner check.
     * @param newIssue      An issue at the same URL path that has been newly
     *                      reported by this Scanner check.
     * @return An indication of which issue(s) should be reported in the main
     * Scanner results. The method should return <code>-1</code> to report the
     * existing issue only, <code>0</code> to report both issues, and
     * <code>1</code> to report the new issue only.
     */
    @Override
    public int consolidateDuplicateIssues(IScanIssue existingIssue, IScanIssue newIssue) {
        // TODO:
        return 0;
    }
}
